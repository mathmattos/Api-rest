package com.aluno.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluno.apirest.dto.CursoDto;
import com.aluno.apirest.service.CursoService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/api/curso")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping
	public ResponseEntity<List<CursoDto>> buscarTodos() {
		return ResponseEntity.ok(this.cursoService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CursoDto> buscarPorId(@PathVariable Long id) {
	return ResponseEntity.ok(this.cursoService.buscarPorId(id));
	}
	
	

}
