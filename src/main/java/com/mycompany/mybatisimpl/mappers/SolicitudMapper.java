/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mybatisimpl.mappers;

import com.mycompany.conceptos.Solicitud;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author juan
 */
public interface SolicitudMapper {
    
    public Solicitud getSolicitud(@Param("solicitudid") int id);
    
    public List<Solicitud> getAllSolicitudesPendientes();
    
    
    
    
}
