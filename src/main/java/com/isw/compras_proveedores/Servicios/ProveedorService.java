package com.isw.compras_proveedores.Servicios;

import java.util.List;

import com.isw.compras_proveedores.DTOs.ProveedorDTO;
import com.isw.compras_proveedores.Modelo.Proveedor;

public interface ProveedorService {
    public Iterable<Proveedor> getAllProveedores();
    public Proveedor createProveedor(ProveedorDTO ProveedorDTO);
    public Proveedor getProveedor(Long proveedorID);
    public Boolean deleteProveedor(Long proveedorID);
}
