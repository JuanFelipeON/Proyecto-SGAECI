/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistence;

import com.mycompany.conceptos.Afiliacion;

/**
 *
 * @author juan
 */
public interface DaoAfiliacion {
    
    /*Me muestra la informacion de la afiliacion del usuario
    */
    //public Afiliacion cargar(int i);
    public Afiliacion generarCertificado(int id);
}
