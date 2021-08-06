package com.mar.repasodos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mar.repasodos.models.Usuario;
import com.mar.repasodos.repositories.UsuarioRepo;

@Service
public class UsuarioService {	

	private final UsuarioRepo usuarioRepo;
	    
	public UsuarioService(UsuarioRepo usuarioRepo) {
		this.usuarioRepo = usuarioRepo;
	}
	  
	public List<Usuario> allUsuarios() {
		return usuarioRepo.findAll();
	}
	  
	public Usuario crearUsuario(Usuario b) {
	        return usuarioRepo.save(b);
	}
	   
	public Usuario buscarUsuario(Long id) {
		Optional<Usuario> optional = usuarioRepo.findById(id);
	    if(optional.isPresent()) {
	    	return optional.get();
	    } else {
	    	return null;
	    }
	}	

}
