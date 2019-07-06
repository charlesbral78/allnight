package com.schoolbit.controller;

import com.schoolbit.model.Night;
import com.schoolbit.service.NightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NightController {

    @Autowired
    private NightService nightService;

    @PostMapping("/night")
    public void salvar(@RequestBody Night night){

        nightService.salvar(night);
    }
    @GetMapping("/night")
    public List<Night> buscarTodas(){
        return nightService.buscarTodas();
    }
}
