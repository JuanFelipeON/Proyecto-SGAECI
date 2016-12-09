/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mybatisimpl;

import com.mycompany.conceptos.Solicitud;
import com.mycompany.mybatisimpl.mappers.SolicitudMapper;
import com.mycompany.persistence.DaoSolicitud;
import com.mycompany.persistence.PersistenceException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author juan
 */
public class MyBatisDAOSolicitud implements DaoSolicitud{
    
    private SqlSession sesionActual;
    
    public MyBatisDAOSolicitud (SqlSession sesion){
        this.sesionActual = sesion;
    }

    @Override
    public Solicitud carga(int i) {
        SolicitudMapper mapper = sesionActual.getMapper(SolicitudMapper.class);
        Solicitud solicitud = mapper.getSolicitud(i);
        sesionActual.commit();
        return solicitud;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Solicitud> cargarTodas() throws PersistenceException {
        SolicitudMapper mapper = sesionActual.getMapper(SolicitudMapper.class);
        List<Solicitud> listaSolicitudes = mapper.getAllSolicitudes();
        return listaSolicitudes;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
