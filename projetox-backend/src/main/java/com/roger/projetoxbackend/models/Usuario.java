package com.roger.projetoxbackend.models;

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
@Table(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String usuario;

	@NotNull
	private String senha;

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

	public Usuario() {
	}

	public Usuario(Long id, @NotNull String usuario, @NotNull String senha, @NotNull String nome,
			@NotNull String sobrenome, Date inscricao, Date manut) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.inscricao = inscricao;
		this.manut = manut;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
