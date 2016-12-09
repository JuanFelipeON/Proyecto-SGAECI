/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mybatisimpl;

import com.mycompany.persistence.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author Juan Felipe Ortiz Niño 
 * Esta clase implementa el framework de persistencia MyBatis
 */
public class MyBatisDaoFactory extends DaoFactory{
    
    private static volatile SqlSessionFactory sqlSessionFactory;
    
    private Properties appProperties=null;
    
    private SqlSession currentsessionsql=null;
    
    /*Constructor de la clase MyBatisDaoFactory*/
    public MyBatisDaoFactory(Properties p){
        this.appProperties = p;
        if(sqlSessionFactory == null){
            synchronized(MyBatisDaoFactory.class){
                if(sqlSessionFactory == null){
                    sqlSessionFactory = getSqlSessionFactory(this.appProperties);
                }
            }
        }
    }
    
    /**
     * Construye un SQLSessionFactory usando el archivo de configuración de
     * MyBatis el cual el  nombre está en el archivo de configuración de la aplicación.
     * @param appProp
     * @return SQLSessionFactory
     */
    private SqlSessionFactory getSqlSessionFactory(Properties appProp) {
        SqlSessionFactory sqlSession = null;
        if (sqlSession == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream(appProp.getProperty("mybatis-config-file"));
                sqlSession = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return sqlSession;
    }  
    
    
    @Override
    public void beginSession() throws PersistenceException{
       currentsessionsql = sqlSessionFactory.openSession();
    }
    
    
    @Override
    public DaoAfiliacion getDaoAfiliacion(){
        return new MyBatisDAOAfiliacion(currentsessionsql);
    }
    
    @Override
    public DaoEgresado getDaoEgresado(){
        return new MyBatisDAOEgresado(currentsessionsql);
    }
    
    @Override
    public DaoEstudiante getDaoEstudiante(){
        return new MyBatisDAOEstudiante(currentsessionsql);
    }
    
    @Override
    public DaoSolicitud getDaoSolicitud(){
        return new MyBatisDAOSolicitud(currentsessionsql);
    }
    
    @Override
    public DaoUsuario getDaoUsuario(){
        return new MyBatisDAOUsuario(currentsessionsql);
    }
    
    @Override
    public void commitTransaction() throws PersistenceException{
        currentsessionsql.commit();
    }

    @Override
    public void rollbackTransaction() throws PersistenceException  {
        currentsessionsql.rollback();
    }

    @Override
    public void endSession()  throws PersistenceException
    {
       currentsessionsql.close();
    }
}
