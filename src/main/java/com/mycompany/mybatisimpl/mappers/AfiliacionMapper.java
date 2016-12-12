/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mybatisimpl.mappers;

import com.mycompany.conceptos.Afiliacion;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author juan
 */
public interface AfiliacionMapper {
    
    public Afiliacion getAfiliacion(@Param("afiliacionid") int id);
}
