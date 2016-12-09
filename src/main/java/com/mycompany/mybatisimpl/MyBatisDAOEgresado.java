/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mybatisimpl;

import com.mycompany.persistence.DaoEgresado;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author juan
 */
public class MyBatisDAOEgresado implements DaoEgresado{
    
    private SqlSession currentSession=null;

    public MyBatisDAOEgresado(SqlSession session) {
        this.currentSession=session;
    }
    
}
