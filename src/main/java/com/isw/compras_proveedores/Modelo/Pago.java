package com.isw.compras_proveedores.Modelo;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Date fechaPago;
    @NotNull
    private BigDecimal monto;
    @NotBlank(message ="Especificar el método de pago")
    private String metodo;
    @OneToOne
    @JoinColumn(name = "factura_id", nullable = false, unique = true)
    private Factura factura;
    @OneToOne
    @JoinColumn(name = "validacion_finanzas_id", nullable = false, unique = true)
    private ValidacionFinanzas validacionFinanzas;
}
