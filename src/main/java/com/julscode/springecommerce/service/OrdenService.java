package com.julscode.springecommerce.service;

import java.util.List;

import com.julscode.springecommerce.model.Orden;

public interface OrdenService {

    Orden save(Orden orden);

    List<Orden> findAll();

   String  generarNumeroOrden();
    
}
