package com.isw.compras_proveedores.Servicios;

import com.isw.compras_proveedores.DTOs.UsuarioDTO;
import com.isw.compras_proveedores.Modelo.Usuario;

public interface UsuarioService {
    public Boolean createUsuario(Usuario usuario);
    public Boolean deleteUsuario(Long idUsuario);
    public UsuarioDTO getUsuarioById(Long idUsuario);
    public Iterable<Usuario> getAllUsuarios(); 
}
