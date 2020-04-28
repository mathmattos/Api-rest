package com.aluno.apirest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluno.apirest.dto.AlunoDto;
import com.aluno.apirest.dto.AlunoResponseDto;
import com.aluno.apirest.mapper.AlunoMapper;
import com.aluno.apirest.models.Aluno;
import com.aluno.apirest.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private AlunoMapper mapper;
	
	public AlunoDto salvar(AlunoDto alunoDto) {
		if (alunoDto == null) 
			return null;
		return mapper.alunoToAlunoDto(this.alunoRepository.save(mapper.alunoDtoToAluno(alunoDto)));
	}
	
	public AlunoDto editar(AlunoDto alunoDto, Long id) {
		Optional<Aluno> al = this.alunoRepository.findById(id);
		if(al.isPresent())
			return mapper.alunoToAlunoDto(this.alunoRepository.save(mapper.alunoDtoToAluno(alunoDto)));
		return null;
	}
	
	public void deletar(Long id) {
		this.alunoRepository.deleteById(id);
	}
	
	public AlunoDto buscarPorId(Long id) {
		Optional<Aluno> aluno = this.alunoRepository.findById(id);
		if(aluno.isPresent())
			return mapper.alunoToAlunoDto(aluno.get());
		return null;
	}
	
	public List<AlunoResponseDto> buscarTodos() {
		List<Aluno> alunos = this.alunoRepository.findAll();
		List<AlunoResponseDto> dtos = new ArrayList<AlunoResponseDto>();
		for (Aluno aluno : alunos) {
			dtos.add(mapper.alunoToAlunoResponseDto(aluno));
		}
		return dtos;
	}
	
	
}
