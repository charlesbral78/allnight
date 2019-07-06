package com.schoolbit.controller;

import com.schoolbit.model.Night;
import com.schoolbit.service.NightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/night")
public class NightController {

    @Autowired
    private NightService nightService;

    @PostMapping
    public void salvar(@RequestBody Night night){

        nightService.salvar(night);
    }
    @GetMapping
    public List<Night> buscarTodas(){
        return nightService.buscarTodas();
    }

    @GetMapping("/{id}")
    public Night buscarPorId(@PathVariable("id") Long id) {
        return nightService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable("id") Long id) {
        this.nightService.excluirPorId(id);
    }
}
