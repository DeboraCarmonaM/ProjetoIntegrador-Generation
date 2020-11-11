package com.DreamTeam.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DreamTeam.model.TemaModel;

	@Repository
	public interface TemaRepository extends JpaRepository< TemaModel, Long> {

		Optional<TemaModel> findByNomeContainingIgnoreCase(String nome); 
			
	}



