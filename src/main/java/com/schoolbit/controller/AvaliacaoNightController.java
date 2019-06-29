package com.schoolbit.controller;

import com.schoolbit.model.AvaliacaoNight;
import com.schoolbit.service.AvaliacaoNightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AvaliacaoNightController {

    @Autowired
    private AvaliacaoNightService avaliacaoNightService;

    @PostMapping("/avaliacoes")
    public void salvar(@RequestBody AvaliacaoNight avaliacaoNight){

        avaliacaoNightService.salvar(avaliacaoNight);
    }

    @GetMapping("/avaliacoes")
    public List<AvaliacaoNight> buscarTodas(){
        return avaliacaoNightService.buscarTodas();
    }
}
