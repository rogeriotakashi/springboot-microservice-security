package com.roger.projetoxbackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Alunos")
public class Alunos {

	@Id
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String sobrenome;

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

	@Override
	public String toString() {
		return "Alunos [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
	
	
	
}
