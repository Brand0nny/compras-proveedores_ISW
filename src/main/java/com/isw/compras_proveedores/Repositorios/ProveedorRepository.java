package com.isw.compras_proveedores.Repositorios;

import org.springframework.data.repository.CrudRepository;

import com.isw.compras_proveedores.Modelo.Proveedor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends CrudRepository<Proveedor, Long>{
    
}
