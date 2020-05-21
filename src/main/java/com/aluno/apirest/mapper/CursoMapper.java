package com.aluno.apirest.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.springframework.data.domain.Page;

import com.aluno.apirest.dto.CursoDto;
import com.aluno.apirest.models.Curso;

@Mapper(componentModel="spring")
public interface CursoMapper {
	
	 CursoDto cursoToCursoDto(Curso curso);
		
	 Curso cursoDtoToCurso(CursoDto cursoDto);
	 
	 @Named("toListDto")
	 public default List<CursoDto> toListDto(Page<Curso> lista){
			List<CursoDto> listaDto = new ArrayList<CursoDto>();
			for(Curso curso : lista) {
				listaDto.add(cursoToCursoDto(curso));
			}
			return listaDto;
		}
	 

}
