package com.ikm.filemgmnt.repository;

import org.springframework.stereotype.Repository;

import com.ikm.filemgmnt.model.CitizenModel;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository

public interface CitizenRepository extends JpaRepository<CitizenModel, Integer> {
    
}
