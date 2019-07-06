package com.schoolbit.controller;


import com.schoolbit.model.Estilo;
import com.schoolbit.service.EstiloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/estilo")
public class EstiloController {

    @Autowired
    private EstiloService estiloService;

    @PostMapping
    public void salvar(@RequestBody Estilo estilo) {
        estiloService.salvar(estilo);
    }

    @GetMapping
    public List<Estilo> buscarTodos() {
        return estiloService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Estilo buscarPorId(@PathVariable("id") Long id) { return estiloService.buscarPorId(id); }

    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable("id") Long id) { this.estiloService.excluirPorId(id); }
}



