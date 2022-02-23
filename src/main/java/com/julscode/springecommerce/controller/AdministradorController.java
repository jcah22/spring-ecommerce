package com.julscode.springecommerce.controller;

import java.util.List;

import com.julscode.springecommerce.model.Producto;
import com.julscode.springecommerce.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public String home(Model model){

        List<Producto> productos =productoService.findAll();
        model.addAttribute("productos", productos);
        return "administrador/home";
    } 
    
}
