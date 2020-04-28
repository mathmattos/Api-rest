package com.aluno.apirest.dto;

import javax.validation.constraints.NotNull;

public class CursoDto {
	
	@NotNull
	private long id;
	
	@NotNull
	private String nome;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
