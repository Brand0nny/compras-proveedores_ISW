package com.isw.compras_proveedores.Modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaterial;
    @NotBlank
    @Size(min = 3, max = 85, message="El nombre debe tener minimo 3 caracteres, maximo 85")
    private String nombre;
    @NotBlank
    @Size(min=3, max=255, message="La descripción no puede estar vacia, minimo de 3 caracteres, maximo de 255")
    private String descripcion;
    @NotNull(message="El stock no puede estar vacio")
    private Integer stock;
    @OneToOne(mappedBy = "material")
    private OrdenCompraItem ordenCompraItem;

    @OneToOne(mappedBy = "material", cascade = CascadeType.ALL, orphanRemoval = true)
    private Inventario inventario;

}
