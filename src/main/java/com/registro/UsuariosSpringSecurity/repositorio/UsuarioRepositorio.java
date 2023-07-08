package com.registro.UsuariosSpringSecurity.repositorio;

import com.registro.UsuariosSpringSecurity.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
