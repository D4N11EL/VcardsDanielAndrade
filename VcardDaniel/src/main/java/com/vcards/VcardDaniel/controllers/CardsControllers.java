/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vcards.VcardDaniel.controllers;

import com.vcards.VcardDaniel.models.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Danie
 */
@Controller
public class CardsControllers {

    @Autowired
    @Qualifier("emps")
    private List<Empleado> empleados;

    @GetMapping("/")
    public String ver(Model model) {
        model.addAttribute("empleados", empleados);
        model.addAttribute("titulo", "VCards");
        return "vcards";
    }

}
