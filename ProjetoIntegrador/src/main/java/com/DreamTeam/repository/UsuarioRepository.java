package com.DreamTeam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DreamTeam.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

	List<UsuarioModel> findByNomeContainingIgnoreCase(String nome);

}
