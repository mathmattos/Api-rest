package com.aluno.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluno.apirest.models.Aluno;
import com.aluno.apirest.service.AlunoService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/api/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public List<Aluno> buscarTodos() {
		return this.alunoService.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public Optional<Aluno> buscarPorId(@PathVariable Long id) {
		return this.alunoService.buscarPorId(id);
	}
	
	@PostMapping()
	public Aluno salvar(@RequestBody Aluno aluno) {
		return this.alunoService.salvar(aluno);
	}
	
	@PutMapping("/{id}")
	public Aluno editar(@RequestBody Aluno aluno, @PathVariable Long id) {
		return this.alunoService.editar(aluno, id);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		this.alunoService.deletar(id);
	}
}
