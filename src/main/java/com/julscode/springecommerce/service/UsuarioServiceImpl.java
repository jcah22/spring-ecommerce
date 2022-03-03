package com.julscode.springecommerce.service;

import com.julscode.springecommerce.model.Usuario;
import com.julscode.springecommerce.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    

    @Override
    public Usuario findById(Integer id) {
        
        return usuarioRepository.findById(id).get();
    }


    
}
