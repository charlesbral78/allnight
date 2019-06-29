package com.schoolbit.controller;


import com.schoolbit.model.Balada;
import com.schoolbit.service.BaladaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaladaController {

    @Autowired
    private BaladaService baladaService;

    @PostMapping("/baladas")
    public void salvar(@RequestBody Balada balada) {
        baladaService.salvar(balada);
    }

    @GetMapping("/baladas")
    public List<Balada> buscarTodas()
    {
        return baladaService.buscarTodas();
    }
}
