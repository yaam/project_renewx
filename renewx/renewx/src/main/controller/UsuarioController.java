package com.renewx.controller;

import com.renewx.model.UsuarioModel;
import com.renewx.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listausuarios")
    public List<UsuarioModel> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @PostMapping
    public UsuarioModel createUsuario(@RequestBody UsuarioModel usuarioModel) {
        return usuarioService.saveUsuario(usuarioModel);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Integer id) {
        usuarioService.deleteUsuario(id);
    }
}
