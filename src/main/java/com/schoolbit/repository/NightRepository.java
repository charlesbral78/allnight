package com.schoolbit.repository;

import com.schoolbit.model.Night;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NightRepository extends JpaRepository<Night,Long> {
}
