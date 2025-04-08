package com.isw.compras_proveedores.Modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProveedor;
    @NotBlank
    @Size(min=3,max=85, message = "El minimo de caracteres debe ser de 3, máximo 85")
    private String nombre;
    @NotBlank
    @Pattern(regexp = "^[A-ZÑ&]{3,4}\\d{6}[A-Z0-9]{3}$", message = "RFC inválido")
    private String rfc;
    @NotBlank(message = "La dirección fiscal no puede estar vacía") 
    @Size(min = 5, max = 200, message = "La dirección debe tener entre 5 y 200 caracteres")
    private String direccionFiscal;
    @NotBlank(message = "El teléfono no puede estar vacío") 
    @Pattern(regexp = "^\\d{10}$", message = "El teléfono debe tener 10 dígitos")
    private String telefono;
    @NotBlank(message = "El email no puede estar vacío") 
    @Email(message = "Debe ser un correo válido")
    private String email;
    @NotBlank(message = "La información bancaria no puede estar vacía") 
    @Size(min = 10, max = 50, message = "La información bancaria debe tener entre 10 y 50 caracteres")
    private String informacionBancaria;
    @NotBlank(message = "La información fiscal no puede estar vacía") 
    private String informacionFiscal;
    @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrdenCompra> ordenCompra;


}
