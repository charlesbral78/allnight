package com.schoolbit.controller;

import com.schoolbit.model.Inscricao;
import com.schoolbit.service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/inscricoes")
public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;

    @PostMapping
    public void salvar(@RequestBody Inscricao inscricao){
        inscricaoService.salvar(inscricao);
    }
    @GetMapping
    public Long bucarQuantidadeInscritosPorNight(@RequestParam Long nightId){
        return inscricaoService.buscarQuantidadeInscritosPorNight(nightId);
    }
}
