package com.aluno.apirest.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CursoDto {
	
	
	@NotNull
	private long id;
	
	@NotNull
	@Size(max = 80)
	private String nome;
	
	@NotNull
	@Size(max = 5000)
	private  String ementa;
	
	@NotNull 
	private java.util.Date dataInicio;
	
	@NotNull 
	private  java.util.Date dataTermino;
	
	@NotNull
	private String qtdMaxAluno;

	public String getQtdMaxAluno() {
		return qtdMaxAluno;
	}

	public void setQtdMaxAluno(String qtdMaxAluno) {
		this.qtdMaxAluno = qtdMaxAluno;
	}

	public long getId() {
		return id;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public java.util.Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(java.util.Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public java.util.Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(java.util.Date dataTermino) {
		this.dataTermino = dataTermino;
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
