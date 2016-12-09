/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mybatisimpl;

import com.mycompany.persistence.DaoAfiliacion;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author juan
 */
public class MyBatisDAOAfiliacion implements DaoAfiliacion{
    
    private SqlSession currentSession=null;

    public MyBatisDAOAfiliacion(SqlSession session) {
        this.currentSession=session;
    }
    
    
}
