package com.aluno.apirest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
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
	
	
	public CursoDto salvar(CursoDto cursoDto) {
		if (cursoDto == null) 
			return null;
		return mapper.cursoToCursoDto(this.cursoRepository.save(mapper.cursoDtoToCurso(cursoDto)));
	}
	
	public CursoDto editar(CursoDto cursoDto, Long id) {
		Optional<Curso> curso = this.cursoRepository.findById(id);
		if(curso.isPresent())
			return mapper.cursoToCursoDto(this.cursoRepository.save(mapper.cursoDtoToCurso(cursoDto)));
		return null;
	}
	
	public CursoDto buscarPorId(Long id) {
		Optional<Curso> cursos = this.cursoRepository.findById(id);
		if (cursos == null)
			return null;
			return mapper.cursoToCursoDto(cursos.get());
	}
	
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
	
	
	
	public Page<CursoDto> listar(int page, int size) {
		Page<Curso> lista = cursoRepository.findAll(PageRequest.of(page, size));		
		return new PageImpl<CursoDto>(mapper.toListDto(lista));
		
	}
	
	public CursoDto buscarNome(String nome) {
		Optional<CursoDto> cursos = this.cursoRepository.findByName(nome);
		if (cursos == null)
			return null;
			return mapper.cursoToCursoDto(cursos.get());
	}
	
	

	 
	
	
	

}
