package com.isw.compras_proveedores.Controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isw.compras_proveedores.Modelo.Usuario;
import com.isw.compras_proveedores.Servicios.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/register")
    public ResponseEntity<String> createUsuario(@RequestBody Usuario usuario){
        try {
            usuarioService.createUsuario(usuario);
            return ResponseEntity.ok().body("Usuario Registrado");
            
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Algo salio mal");
        }
    }
}
