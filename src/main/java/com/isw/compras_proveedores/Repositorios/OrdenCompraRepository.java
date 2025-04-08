package com.isw.compras_proveedores.Repositorios;

import org.springframework.data.repository.CrudRepository;

import com.isw.compras_proveedores.Modelo.OrdenCompra;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenCompraRepository extends CrudRepository<OrdenCompra, Long>{

}
