/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conceptos;

/**
 *
 * @author juan
 */
public class Egresado extends Solicitante{
    
    public String direccion;
    public String promocion;
    
    
    @Override
    public Egresado getInstance(){
        return this;
    }
}
