package com.schoolbit.controller;

import com.schoolbit.model.Baladeiro;
import com.schoolbit.service.BaladeiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/baladeiros")
public class BaladeiroController {

    @Autowired
    private BaladeiroService baladeiroService;

    @PostMapping
    public void salvar(@RequestBody Baladeiro baladeiro) {
        baladeiroService.salvar(baladeiro);
    }

    @GetMapping
    public List<Baladeiro> buscarTodos() {
        return baladeiroService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Baladeiro buscarPorId(@PathVariable("id") Long id) {
        return baladeiroService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable("id") Long id) {
        this.baladeiroService.excluirPorId(id);
    }
}

