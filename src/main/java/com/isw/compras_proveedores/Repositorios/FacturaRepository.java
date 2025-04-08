package com.isw.compras_proveedores.Repositorios;

import org.springframework.data.repository.CrudRepository;

import com.isw.compras_proveedores.Modelo.Factura;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Long> {

}
