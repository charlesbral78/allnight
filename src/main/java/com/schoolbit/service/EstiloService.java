package com.schoolbit.service;

import com.schoolbit.model.Estilo;
import com.schoolbit.repository.EstiloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.List;

@Service
public class EstiloService {

    @Autowired
    private EstiloRepository estiloRepository;

    public void salvar(Estilo estilo) { estiloRepository.save(estilo); }

    public List<Estilo> buscarTodos() { return estiloRepository.findAll(); }

    public Estilo buscarPorId(Long id) { return estiloRepository.findById(id).orElse(null); }

    public void excluirPorId(Long id) { estiloRepository.deleteById(id); }
}
