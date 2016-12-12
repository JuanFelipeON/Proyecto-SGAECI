/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mybatisimpl;

import com.mycompany.conceptos.Afiliacion;
import com.mycompany.mybatisimpl.mappers.AfiliacionMapper;
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

    @Override
    public Afiliacion generarCertificado(int id) {
        AfiliacionMapper mapper = currentSession.getMapper(AfiliacionMapper.class);
        Afiliacion af = mapper.getAfiliacion(id);
        currentSession.commit();
        return af;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
