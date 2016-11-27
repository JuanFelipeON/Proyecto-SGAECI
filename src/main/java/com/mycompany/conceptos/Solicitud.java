/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conceptos;

import java.util.Date;

/**
 *
 * @author juan
 */
public class Solicitud {
    
    public boolean estado;
    public int id;
    public Date fecha;
    public int solicitanteID;

    public Solicitud(int id, Date fecha, int solicitanteID) {
        this.estado = false;
        this.id = id;
        this.fecha = fecha;
        this.solicitanteID = solicitanteID;
    }

    
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getSolicitanteID() {
        return solicitanteID;
    }
        
    
}
