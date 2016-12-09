/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistence;

import com.mycompany.conceptos.Solicitud;
import java.util.List;

/**
 *
 * @author juan
 */
public interface DaoSolicitud {
    
    /*Carga una solicitud de afiliacion registrada*/
    public Solicitud carga(int i);
    
    /*Carga todas las solicitudes de afiliaciones registradas
    */
    public List<Solicitud> cargarTodas() throws PersistenceException;
    
    
}
