package com.aluno.apirest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluno.apirest.dto.CursoDto;
import com.aluno.apirest.mapper.CursoMapper;
import com.aluno.apirest.models.Curso;
import com.aluno.apirest.repository.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private CursoMapper mapper;
	
	public List<CursoDto> findAll() {
		List<Curso> cursos = this.cursoRepository.findAll();
		List<CursoDto> dtos = new ArrayList<CursoDto>();
		if(cursos.isEmpty())
			return null;
		for (Curso curso : cursos) {
			dtos.add(mapper.cursoToCursoDto(curso));
		}
		return dtos;
	}

}
