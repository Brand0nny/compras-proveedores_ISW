package com.isw.compras_proveedores.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isw.compras_proveedores.Modelo.OrdenCompraItem;
@Repository
public interface OrdenCompraItemRepository extends CrudRepository<OrdenCompraItem,Long> {

}
