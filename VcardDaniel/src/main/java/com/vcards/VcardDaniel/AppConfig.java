/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vcards.VcardDaniel;

import com.vcards.VcardDaniel.models.Ciudad;
import com.vcards.VcardDaniel.models.Empleado;
import com.vcards.VcardDaniel.models.Sucursal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 *
 * @author Danie
 */
@Configuration
public class AppConfig {

    @Autowired
    private Environment environment;

    @Bean("emps")
    public List<Empleado> registarEmpleados() {
        return crearEmpleados();
    }

    private List<Empleado> crearEmpleados() {

        List<Empleado> listaEmpleados = new ArrayList<>();

        for (int i = 0; i <= 2; i++) {

            String ciuCodigo = environment.getProperty("ciudad.codigo" + i);
            String ciuNombre = environment.getProperty("ciudad.nombre" + i);
            String sucCodigo = environment.getProperty("sucursal.cod" + i);
            String sucNombre = environment.getProperty("sucursal.nombre" + i);
            String img = environment.getProperty("imagen.img" + i);
            String empNombre = environment.getProperty("empleado.nombre" + i);

            Empleado empleado = new Empleado(empNombre, img, new Sucursal(sucCodigo, sucNombre), new Ciudad(ciuCodigo, ciuNombre));
            listaEmpleados.add(empleado);

            System.out.println(ciuCodigo + ciuNombre + sucCodigo + sucNombre + img + empNombre);

        }

        return listaEmpleados;
    }

}
