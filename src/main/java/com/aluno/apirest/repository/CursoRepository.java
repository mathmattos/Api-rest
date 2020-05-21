package com.aluno.apirest.repository;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aluno.apirest.dto.CursoDto;
import com.aluno.apirest.models.Curso;

@Repository
public interface CursoRepository  extends JpaRepository<Curso, Long> {
	
@Query("select c from Curso c where c.nome = : nome and c.dataInicio = : dataInicio and c.dataFim = : dataFim")
	Page<CursoDto> findBy(String nome, Date dataInicio, Date dataTermino, Pageable pageable);

@Query("select c from Curso c where c.nome = : nome")
	Optional<CursoDto> findByName(String nome);

	




}




