package com.registro.UsuariosSpringSecurity.servicio;

import com.registro.UsuariosSpringSecurity.dto.UsuarioRegistroDTO;
import com.registro.UsuariosSpringSecurity.modelo.Rol;
import com.registro.UsuariosSpringSecurity.modelo.Usuario;
import com.registro.UsuariosSpringSecurity.repositorio.UsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UsuarioService implements IUsuarioServicio {

    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioService(UsuarioRepositorio usuarioRepositorio) {
        super();
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public Usuario save(UsuarioRegistroDTO usuarioRegistroDTO) {
        Usuario usuario = new Usuario(usuarioRegistroDTO.getNombre(),
                usuarioRegistroDTO.getApellido(), usuarioRegistroDTO.getEmail(),
                usuarioRegistroDTO.getPassword(), Arrays.asList(new Rol("ROLE_USER")));
        return usuarioRepositorio.save(usuario);
    }
}
