package com.aluno.apirest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluno.apirest.models.Aluno;
import com.aluno.apirest.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public Aluno salvar(Aluno aluno) {
		if (aluno == null) 
			return null;
		return this.alunoRepository.save(aluno);
	}
	
	public Aluno editar(Aluno aluno, Long id) {
		Optional<Aluno> al = this.alunoRepository.findById(id);
		if(al == null)
			return null;
		return this.alunoRepository.save(aluno);
	}
	
	public void deletar(Long id) {
		this.alunoRepository.deleteById(id);
	}
	
	public Optional<Aluno> buscarPorId(Long id) {
		Optional<Aluno> aluno = this.alunoRepository.findById(id);
		if(aluno == null)
			return null;
		return aluno;
	}
	
	public List<Aluno> buscarTodos() {
		return this.alunoRepository.findAll();
	}
}
