package com.aluno.apirest.dto;



public class CursoResponseDto {
	
	
	private long id;
	
    private String nome;
    
	private  String ementa;
	
	private java.util.Date dataInicio;
	
	private  java.util.Date dataTermino;
	
	private String qtdMaxAluno;

	
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

	public String getQtdMaxAluno() {
		return qtdMaxAluno;
	}

	public void setQtdMaxAluno(String qtdMaxAluno) {
		this.qtdMaxAluno = qtdMaxAluno;
	}


}
