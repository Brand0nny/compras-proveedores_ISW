package com.isw.compras_proveedores.Repositorios;

import org.springframework.data.repository.CrudRepository;

import com.isw.compras_proveedores.Modelo.Pago;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends CrudRepository<Pago, Long>{

}
