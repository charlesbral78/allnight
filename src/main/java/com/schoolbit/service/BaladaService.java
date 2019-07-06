package com.schoolbit.service;

import com.schoolbit.model.Balada;
import com.schoolbit.repository.BaladaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaladaService {

    @Autowired
    private BaladaRepository baladaRepository;

    public void salvar(Balada balada) {
        baladaRepository.save(balada);
    }

    public List<Balada> buscarTodas() {
        return baladaRepository.findAll();
    }

    public Balada buscarPorId(Long id) {
        return baladaRepository.getOne(id);
    }

    public void excluirPorId(Long id) {
        baladaRepository.deleteById(id);
    }
}
