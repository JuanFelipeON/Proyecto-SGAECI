/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mybatisimpl.mappers;

import com.mycompany.conceptos.Solicitud;
import java.util.List;

/**
 *
 * @author juan
 */
public interface SolicitudMapper {
    
    public Solicitud getSolicitud(int id);
    
    public List<Solicitud> getAllSolicitudes();
}
