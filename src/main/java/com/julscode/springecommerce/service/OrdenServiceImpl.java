package com.julscode.springecommerce.service;

import java.util.ArrayList;
import java.util.List;

import com.julscode.springecommerce.model.Orden;
import com.julscode.springecommerce.repository.OrdenRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenServiceImpl implements OrdenService{

    @Autowired
    private OrdenRepository ordenRepository;

    @Override
    public Orden save(Orden orden) {
       
        return ordenRepository.save(orden);
    }

    @Override
    public List<Orden> findAll() {
       
        return ordenRepository.findAll();
    }

    public String generarNumeroOrden(){
        int numero = 0;
        String numeroConacatenado = "";
        List<Orden> ordenes = findAll();

        List<Integer> numeros = new ArrayList<>(); 

        ordenes.stream().forEach(o -> numeros.add(Integer.parseInt(o.getNumero())));

        if(ordenes.isEmpty()){
            numero = 1;
        }else{
            numero = numeros.stream().max(Integer::compare).get();
            numero++;
        }
        
        if(numero <10){
            numeroConacatenado = "000000000"+ String.valueOf(numero);
        }
        else if(numero < 100){
            numeroConacatenado = "00000000"+ String.valueOf(numero);
        }else if(numero < 1000 ){
            numeroConacatenado = "0000000"+ String.valueOf(numero);
        }else if(numero < 10000){
            numeroConacatenado = "000000"+ String.valueOf(numero);
        }



        return numeroConacatenado;
    }
    
}
