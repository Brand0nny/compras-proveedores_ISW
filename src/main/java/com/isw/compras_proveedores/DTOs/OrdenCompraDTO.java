package com.isw.compras_proveedores.DTOs;

import java.math.BigDecimal;
import java.util.Date;

public class OrdenCompraDTO {
    private Long idOrdenCompra;
    private Date fecha;
    private EstadoOrden estado;
    private BigDecimal total;
    private enum EstadoOrden{
        REQUISICION,
        PENDIENTE,
        APROBADA,
        RECHAZADA,
        CANCELADA
    }
}
