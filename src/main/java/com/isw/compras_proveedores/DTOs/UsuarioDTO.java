package com.isw.compras_proveedores.DTOs;

public class UsuarioDTO {
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String email;
    private Role role;
    public enum Role{
        ADMIN,
        COMPRADOR,
        LECTOR,
        SUPERVISOR
    }
}
