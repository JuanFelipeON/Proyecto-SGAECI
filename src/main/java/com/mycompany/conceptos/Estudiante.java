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
public class Estudiante extends Solicitante{
    
    public String carrera;
    public int codigo;
    public int semestre;
    
    @Override
    public Estudiante getInstance(){
        return this;
    } 
    
    
    
}
