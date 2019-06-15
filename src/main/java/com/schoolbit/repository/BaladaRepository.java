package com.schoolbit.repository;

import com.schoolbit.model.Balada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaladaRepository extends JpaRepository<Balada, Long> {
}
