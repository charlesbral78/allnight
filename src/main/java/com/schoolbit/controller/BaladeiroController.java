package com.schoolbit.controller;

import com.schoolbit.model.Baladeiro;
import com.schoolbit.service.BaladeiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaladeiroController {

    @Autowired
    private BaladeiroService baladeiroService;

    @PostMapping("/baladeiros")
    public void salvar(@RequestBody Baladeiro baladeiro) {

        baladeiroService.salvar(baladeiro); }

    @GetMapping("/baladeiros")
    public List<Baladeiro> buscarTodos() { return baladeiroService.buscarTodos(); }

}

