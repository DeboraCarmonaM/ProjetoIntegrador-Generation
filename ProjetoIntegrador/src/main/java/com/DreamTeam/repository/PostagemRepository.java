package com.DreamTeam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DreamTeam.model.PostagemModel;
import com.DreamTeam.model.TemaModel;

public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {

	List<PostagemModel>findByTema(TemaModel tema);

	List<PostagemModel> findByTituloContainingIgnoreCase(String titulo);

}
