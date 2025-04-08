package com.isw.compras_proveedores.Servicios.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isw.compras_proveedores.DTOs.UsuarioDTO;
import com.isw.compras_proveedores.Modelo.Usuario;
import com.isw.compras_proveedores.Modelo.Usuario.Role;
import com.isw.compras_proveedores.Repositorios.UsuarioRepository;
import com.isw.compras_proveedores.Servicios.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Boolean createUsuario(Usuario usuario) {
         usuarioRepository.save(Usuario.builder()
        .nombre(usuario.getNombre())
        .apellido(usuario.getApellido())
        .nombreUsuario(usuario.getNombreUsuario())
        .contrasena(usuario.getContrasena())
        .role(Role.LECTOR)
        .build());
        return true;
    }

    @Override
    public Boolean deleteUsuario(Long idUsuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUsuario'");
    }

    @Override
    public UsuarioDTO getUsuarioById(Long idUsuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsuarioById'");
    }

    @Override
    public Iterable<Usuario> getAllUsuarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsuarios'");
    }

}
