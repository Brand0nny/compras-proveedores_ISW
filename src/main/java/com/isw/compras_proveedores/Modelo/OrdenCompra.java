package com.isw.compras_proveedores.Modelo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class OrdenCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdenCompra;
    @NotNull
    private Date fecha;
    // El estado se debe asignar de forma automatica por primera vez como "Requisicion", posteriormente, dependiendo de los procesos, el 
    // estado deberia cambiar a pendiente -> aprobada || pendiente -> rechazada || pendiente -> cancelada. Una orden aprobada o rechazada
    // no debe poder ser cancelada.
    @NotNull
    private EstadoOrden estado;
    @NotNull
    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name="proveedor_id")
    private Proveedor proveedor;
    
    @OneToMany(mappedBy = "ordenCompra", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrdenCompraItem> ordenCompraItem;

    @OneToOne(mappedBy = "ordenCompra", cascade = CascadeType.ALL, orphanRemoval = true)
    private Factura factura;
    public enum EstadoOrden {
        REQUISICION,
        PENDIENTE,
        APROBADA,
        RECHAZADA,
        CANCELADA
    }
}
