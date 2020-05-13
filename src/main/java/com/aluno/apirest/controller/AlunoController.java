package com.aluno.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluno.apirest.dto.AlunoDto;
import com.aluno.apirest.dto.AlunoResponseDto;
import com.aluno.apirest.service.AlunoService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/api/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public ResponseEntity<List<AlunoResponseDto>> buscarTodos() {
		return ResponseEntity.ok(this.alunoService.buscarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AlunoDto> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(this.alunoService.buscarPorId(id));
	}
	
	@PostMapping
	public ResponseEntity<AlunoDto> salvar(@RequestBody @Valid AlunoDto dto) {
	    return ResponseEntity.ok(alunoService.salvar(dto));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<AlunoDto> editar(@RequestBody @Valid AlunoDto dto, @PathVariable Long id) {
		return ResponseEntity.ok(this.alunoService.editar(dto, id));
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		this.alunoService.deletar(id);
	}
}
