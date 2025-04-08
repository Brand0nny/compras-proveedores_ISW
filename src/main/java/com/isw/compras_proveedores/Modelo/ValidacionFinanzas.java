package com.isw.compras_proveedores.Modelo;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class ValidacionFinanzas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idValidacionFinanzas;
    @NotNull
    private Date fechaValidacion;
    @NotBlank
    @Size(min = 3, max =255, message="Agregar observaciones, maximo 255 caracteres.")
    private String observaciones;
    private EstadoValidacionFinanzas estadoValidacionFinanza;
    @OneToOne(optional = false)
    @JoinColumn(name="orden_compra_id", nullable = false, unique = true)
    private OrdenCompra ordenCompra;
    @OneToOne(mappedBy = "validacionFinanzas", cascade = CascadeType.ALL, orphanRemoval = true)
    private Pago pago;
    public enum EstadoValidacionFinanzas{
        PENDIENTE,
        APROBADA,
        RECHAZADA
    }
}
