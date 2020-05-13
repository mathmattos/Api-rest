package com.aluno.apirest.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aluno.apirest.models.Curso;

@Repository
public interface CursoRepository  extends JpaRepository<Curso, Long> {
	
	@Query("select c from Curso c where c.nome = :nome and c.dataInicio = : dataInicio and c.dataFim = : dataFim")
    public List<Curso> findByname(@Param("nome") String nome, @Param("dataInicio") Date dataInicio, @Param("dataFim") Date dataFim);
	
	

}
