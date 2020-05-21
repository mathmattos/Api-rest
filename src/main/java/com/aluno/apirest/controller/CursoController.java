package com.aluno.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping
	public ResponseEntity<CursoDto> salvar(@RequestBody @Valid CursoDto dto) {
	    return ResponseEntity.ok(cursoService.salvar(dto));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CursoDto> editar(@RequestBody @Valid CursoDto dto, @PathVariable Long id) {
		return ResponseEntity.ok(this.cursoService.editar(dto, id));
	}


	@GetMapping
	public ResponseEntity<List<CursoDto>> buscarTodos() {
		return ResponseEntity.ok(this.cursoService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CursoDto> buscarPorId(@PathVariable Long id) {
	return ResponseEntity.ok(this.cursoService.buscarPorId(id));
	}
	

	@GetMapping(path = "pages")
	public ResponseEntity<Page<CursoDto>> listar(int page, int size) {
		return ResponseEntity.ok(cursoService.listar(page, size));
	}

    
    
    
    
    
    
    
    
    
    
    
    

}
