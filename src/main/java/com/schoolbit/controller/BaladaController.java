package com.schoolbit.controller;


import com.schoolbit.model.Balada;
import com.schoolbit.service.BaladaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/baladas")
public class BaladaController {

    @Autowired
    private BaladaService baladaService;

    @PostMapping
    public void salvar(@RequestBody Balada balada) {
        baladaService.salvar(balada);
    }

    @GetMapping
    public List<Balada> buscarTodas() {
        return baladaService.buscarTodas();
    }

    @GetMapping("/{id}")
    public Balada buscarPorId(@PathVariable("id") Long id) {
        return baladaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable("id") Long id) {
        this.baladaService.excluirPorId(id);
    }
}
