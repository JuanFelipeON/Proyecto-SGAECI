/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conceptos;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author juan
 */
public class Afiliacion {
    
    public int id;
    public Date fechaInicio;
    public Date fechaFinal;
    public boolean estado;
    //public HashMap<int,File> pagos;

    public Afiliacion(int id, Date fechaInicio, boolean estado) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        //this.fechaFinal = fechaInicio + un año;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
}
