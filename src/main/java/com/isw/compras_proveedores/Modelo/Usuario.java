package com.isw.compras_proveedores.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @NotBlank(message="Este campo no puede estar vacío")
    private String contrasena;
    @NotBlank(message="Este campo no puede estar vacío")
    private String nombre;
    @NotBlank(message="Este campo no puede estar vacío")
    private String apellido;
    @NotBlank(message="Este campo no puede estar vacío")
    private String nombreUsuario;
    //El rol como lector estoy planteando quitarlo o dejarlo.
    @NotNull
    private Role role;

    public enum Role{
        ADMIN,
        COMPRADOR,
        LECTOR,
        SUPERVISOR
    }
}
