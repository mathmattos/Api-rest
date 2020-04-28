package com.aluno.apirest.mapper;

import org.mapstruct.Mapper;

import com.aluno.apirest.dto.CursoDto;
import com.aluno.apirest.models.Curso;

@Mapper(componentModel="spring")
public interface CursoMapper {
	
	 CursoDto cursoToCursoDto(Curso curso);
		
	 Curso cursoDtoToCurso(CursoDto cursoDto);

}
