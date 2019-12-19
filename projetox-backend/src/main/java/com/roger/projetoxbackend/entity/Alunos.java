package com.roger.projetoxbackend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Alunos")
public class Alunos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String sobrenome;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "dat_inscricao")
	private Date inscricao;
	
	@JsonFormat(pattern = "yyyy-MM-dd")	
	@Column(name = "dat_manut")
	private Date manut;

	public Alunos() {}

	public Alunos(Long id, @NotNull String nome, @NotNull String sobrenome) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getInscricao() {
		return inscricao;
	}

	public void setInscricao(Date inscricao) {
		this.inscricao = inscricao;
	}

	public Date getManut() {
		return manut;
	}

	public void setManut(Date manut) {
		this.manut = manut;
	}

	

	
	
	
	



	
	
	
	
	
}
