/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vcards.VcardDaniel.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 *
 * @author Danie
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Empleado {
    
        private String nombre;
    private String img;
    private Sucursal sucursal;
    private Ciudad ciudad;

    
}
