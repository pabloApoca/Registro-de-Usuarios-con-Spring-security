package com.registro.UsuariosSpringSecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class UsuarioRegistroDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;

}
