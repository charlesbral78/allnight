package com.schoolbit.controller;


import com.schoolbit.model.Estilo;
import com.schoolbit.service.EstiloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
public class EstiloController {

    @Autowired
    private EstiloService estiloService;

    @PostMapping("/estilos")
    public void salvar(@RequestBody Estilo estilo) {

        estiloService.salvar(estilo);
    }

    @GetMapping("/estilos")
    public List<Estilo> buscarTodos() { return estiloService.buscarTodos(); }

}
