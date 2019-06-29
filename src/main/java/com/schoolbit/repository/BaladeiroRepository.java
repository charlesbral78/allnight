package com.schoolbit.repository;

import com.schoolbit.model.Baladeiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaladeiroRepository extends JpaRepository<Baladeiro, Long> {
}
