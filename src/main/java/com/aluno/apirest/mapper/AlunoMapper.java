package com.aluno.apirest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.aluno.apirest.dto.AlunoDto;
import com.aluno.apirest.dto.AlunoResponseDto;
import com.aluno.apirest.models.Aluno;

@Mapper(componentModel="spring")
public interface AlunoMapper {
	
	@Mapping(source = "curso.id", target = "cursoId")
    AlunoDto alunoToAlunoDto(Aluno aluno);
	
	@Mapping(source = "cursoId", target = "curso.id")
	Aluno alunoDtoToAluno(AlunoDto alunoDto);
	
	AlunoResponseDto alunoToAlunoResponseDto(Aluno aluno);
}
