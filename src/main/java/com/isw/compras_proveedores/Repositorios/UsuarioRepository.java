package com.isw.compras_proveedores.Repositorios;

import org.springframework.data.repository.CrudRepository;

import com.isw.compras_proveedores.Modelo.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
