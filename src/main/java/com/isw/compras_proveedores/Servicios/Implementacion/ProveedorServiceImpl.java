package com.isw.compras_proveedores.Servicios.Implementacion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isw.compras_proveedores.DTOs.ProveedorDTO;
import com.isw.compras_proveedores.Modelo.Proveedor;
import com.isw.compras_proveedores.Repositorios.ProveedorRepository;
import com.isw.compras_proveedores.Servicios.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{
    @Autowired
    public ProveedorRepository proveedorRepository;

    @Override
    public Iterable<Proveedor> getAllProveedores() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor createProveedor(ProveedorDTO ProveedorDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProveedor'");
    }

    @Override
    public Proveedor getProveedor(Long proveedorID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProveedor'");
    }

    @Override
    public Boolean deleteProveedor(Long proveedorID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProveedor'");
    }

}
