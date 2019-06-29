package com.schoolbit.service;

import com.schoolbit.model.AvaliacaoNight;
import com.schoolbit.repository.AvaliacaoNightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoNightService {

    @Autowired
    private AvaliacaoNightRepository avaliacaoNightRepository;

    public void salvar(AvaliacaoNight avaliacaoNight){
        avaliacaoNightRepository.save(avaliacaoNight);
    }
    public List<AvaliacaoNight> buscarTodas() {
        return avaliacaoNightRepository.findAll();
    }
}
