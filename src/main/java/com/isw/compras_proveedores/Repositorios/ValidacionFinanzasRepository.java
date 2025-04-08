package com.isw.compras_proveedores.Repositorios;

import org.springframework.data.repository.CrudRepository;

import com.isw.compras_proveedores.Modelo.ValidacionFinanzas;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidacionFinanzasRepository extends CrudRepository<ValidacionFinanzas, Long> {

}
