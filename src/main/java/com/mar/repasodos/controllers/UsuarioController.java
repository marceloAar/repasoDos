package com.mar.repasodos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mar.repasodos.models.Usuario;
import com.mar.repasodos.services.UsuarioService;

@Controller
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService){
		this.usuarioService = usuarioService;
	}
	
	@RequestMapping("/")
    public String index(@ModelAttribute("usuarios") Usuario usuario) {
        
        return "index.jsp";
    }
	
	//crear nuevo       
    @RequestMapping(value="/registrar", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("usuarios") Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "registro.jsp";
        } else {
        	usuarioService.crearUsuario(usuario);
            return "redirect:/";
        }
    }
    
    @RequestMapping("/registro")
    public String registar(Model model) {
        List<Usuario> usuarios = usuarioService.allUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "registro.jsp";
    }

}
