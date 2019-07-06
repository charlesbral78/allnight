package com.schoolbit.service;

import com.schoolbit.model.Baladeiro;
import com.schoolbit.repository.BaladeiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaladeiroService {

    @Autowired
    private BaladeiroRepository baladeiroRepository;

    public void salvar(Baladeiro baladeiro) { baladeiroRepository.save(baladeiro); }

    public List<Baladeiro> buscarTodos() {
        return baladeiroRepository.findAll();
    }

    public Baladeiro buscarPorId(Long id) {
        return baladeiroRepository.findById(id).orElse(null);
    }

    public void excluirPorId(Long id) {
        baladeiroRepository.deleteById(id);
    }
}
