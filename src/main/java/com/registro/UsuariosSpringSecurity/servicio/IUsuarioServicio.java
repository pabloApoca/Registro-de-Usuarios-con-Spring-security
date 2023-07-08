package com.registro.UsuariosSpringSecurity.servicio;

import com.registro.UsuariosSpringSecurity.dto.UsuarioRegistroDTO;
import com.registro.UsuariosSpringSecurity.modelo.Usuario;

public interface IUsuarioServicio {

    public Usuario save(UsuarioRegistroDTO usuarioRegistroDTO);
}
