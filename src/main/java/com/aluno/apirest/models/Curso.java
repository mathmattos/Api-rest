package com.aluno.apirest.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="curso")
public class Curso implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
    @Column(name = "ementa")
	private  String ementa;
	
	@Column(name = "dataInicio")
	private java.util.Date dataInicio;
	
	@Column(name = "dataFim")
	private  java.util.Date dataFim;
	
	@Column(name = "qtdMaxAluno")
	private String qtdMaxAluno;
	

	public String getQtdMaxAluno() {
		return qtdMaxAluno;
	}

	public void setQtdMaxAluno(String qtdMaxAluno) {
		this.qtdMaxAluno = qtdMaxAluno;
	}

	public void setDataFim(java.util.Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public java.util.Date getDataFim() {
		return dataFim;
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
