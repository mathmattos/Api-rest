package com.aluno.apirest.dto;

public class AlunoResponseDto {
	
	private long id;
	
	private String nome;
	
	private String rg;
	
	private String ra;
	
	private String serie;
	
	private String cidade;
	
	private CursoDto curso;

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

	public CursoDto getCurso() {
		return curso;
	}

	public void setCurso(CursoDto curso) {
		this.curso = curso;
	}
}
