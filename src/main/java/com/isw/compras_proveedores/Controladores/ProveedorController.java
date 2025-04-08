package com.isw.compras_proveedores.Controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isw.compras_proveedores.Modelo.Proveedor;
import com.isw.compras_proveedores.Servicios.ProveedorService;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {
    @Autowired
    ProveedorService proveedorService;

    @GetMapping("/")
    public ResponseEntity<Iterable<Proveedor>> getProveedoores(){
        return ResponseEntity.ok(proveedorService.getAllProveedores());
    }

}
