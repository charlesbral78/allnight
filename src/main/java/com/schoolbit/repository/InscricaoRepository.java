package com.schoolbit.repository;

import com.schoolbit.model.Inscricao;
import com.schoolbit.model.Night;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {

    List<Inscricao> findByNight(Night night);
}
