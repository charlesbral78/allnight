package com.schoolbit.repository;

import com.schoolbit.model.AvaliacaoNight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoNightRepository extends JpaRepository<AvaliacaoNight,Long> {

}
