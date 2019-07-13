package com.schoolbit.service;

import com.schoolbit.model.Inscricao;
import com.schoolbit.model.Night;
import com.schoolbit.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @Autowired
    private  NightService nightService;

    public void salvar(Inscricao inscricao){
        inscricaoRepository.save(inscricao);
    }

    public Inscricao buscarPorId(Long id) {
        return inscricaoRepository.findById(id).orElse(null);
    }

    public Long buscarQuantidadeInscritosPorNight(Long nightId) {

      Night night = nightService.buscarPorId(nightId);

        List<Inscricao> inscricoes = inscricaoRepository.findByNight(night);

        return Long.valueOf(inscricoes.size());


    }
    }
