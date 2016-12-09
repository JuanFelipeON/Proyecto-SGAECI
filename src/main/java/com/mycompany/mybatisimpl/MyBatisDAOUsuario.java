/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mybatisimpl;

import com.mycompany.persistence.DaoUsuario;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author juan
 */
public class MyBatisDAOUsuario implements DaoUsuario{
    
    private SqlSession sesionActual;
    
    public MyBatisDAOUsuario (SqlSession sesion){
        this.sesionActual = sesion;
    }
}
