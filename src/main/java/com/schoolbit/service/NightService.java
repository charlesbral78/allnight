package com.schoolbit.service;
import com.schoolbit.model.Night;
import com.schoolbit.repository.NightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NightService {

    @Autowired
    private NightRepository nightRepository;

    public void salvar(Night night){
                nightRepository.save(night);
    }
    public List<Night> buscarTodas() {
        return nightRepository.findAll();
    }
}
