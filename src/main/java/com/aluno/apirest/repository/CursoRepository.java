package com.aluno.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aluno.apirest.models.Curso;

@Repository
public interface CursoRepository  extends JpaRepository<Curso, Long> {

}
