package com.julscode.springecommerce.controller;

import com.julscode.springecommerce.model.Producto;
import com.julscode.springecommerce.model.Usuario;
import com.julscode.springecommerce.service.ProductoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;



    @GetMapping("")
    public String show(){


        return "productos/show";

    }

    @GetMapping("/create")
    public String create(){

        return "productos/create";
    }



    @PostMapping("/save")
    public String save(Producto producto){
        LOGGER.info("este es el objeto producto {}",producto);
        Usuario usuario = new Usuario(1);
        producto.setUsuario(usuario);
        productoService.save(producto);


        return "redirect:/productos";
    }


    
    
}
