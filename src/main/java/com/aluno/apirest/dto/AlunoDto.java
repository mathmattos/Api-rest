package com.aluno.apirest.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AlunoDto {
	
	@NotNull
	private long id;
	
	@NotNull
	@Size(max = 30)
	private String nome;
	
	@NotNull
	@Size(max = 9)
	private String rg;
	
	@NotNull
	@Size(max = 8)
	private String ra;
	
	@NotNull
	@Size(max = 20)
	private String serie;
	
	@NotNull
	@Size(max = 50)
	private String cidade;
	
	private long cursoId;

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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public long getCursoId() {
		return cursoId;
	}

	public void setCursoId(long cursoId) {
		this.cursoId = cursoId;
	}
	
}
