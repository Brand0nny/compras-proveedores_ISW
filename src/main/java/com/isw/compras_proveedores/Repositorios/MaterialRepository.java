package com.isw.compras_proveedores.Repositorios;
import org.springframework.data.repository.CrudRepository;
import com.isw.compras_proveedores.Modelo.Material;

import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Long>{

}
