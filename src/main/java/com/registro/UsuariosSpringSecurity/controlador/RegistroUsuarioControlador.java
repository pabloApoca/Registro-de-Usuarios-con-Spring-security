package com.registro.UsuariosSpringSecurity.controlador;

import com.registro.UsuariosSpringSecurity.dto.UsuarioRegistroDTO;
import com.registro.UsuariosSpringSecurity.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {

    @Autowired
    UsuarioService usuarioService;

    @ModelAttribute("usuario")
    public UsuarioRegistroDTO save(){
        return new UsuarioRegistroDTO();
    }

    @GetMapping
    public String mostrarFormulario() {
        return "registro";
    }

    @PostMapping
    public String registrarCuentaUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO usuarioRegistroDTO) {
        usuarioService.save(usuarioRegistroDTO);
        return "redirect:/registro?exito";
    }
}
