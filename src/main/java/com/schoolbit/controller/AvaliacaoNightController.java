package com.schoolbit.controller;

import com.schoolbit.model.AvaliacaoNight;
import com.schoolbit.service.AvaliacaoNightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/avaliacaonight")
public class AvaliacaoNightController {

    @Autowired
    private AvaliacaoNightService avaliacaoNightService;

    @PostMapping
    public void salvar(@RequestBody AvaliacaoNight avaliacaoNight){

        avaliacaoNightService.salvar(avaliacaoNight);
    }

    @GetMapping
    public List<AvaliacaoNight> buscarTodas(){
        return avaliacaoNightService.buscarTodas();
    }

    @GetMapping("/{id}")
    public AvaliacaoNight buscarPorId(@PathVariable("id") Long id) {
        return avaliacaoNightService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable("id") Long id) {
        this.avaliacaoNightService.excluirPorId(id);
    }
}
