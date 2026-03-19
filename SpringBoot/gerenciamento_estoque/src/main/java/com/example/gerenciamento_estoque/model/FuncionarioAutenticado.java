package com.example.gerenciamento_estoque.model;

import jakarta.persistence.*;

@Entity
@Table(name = "funcionarios_autenticados")
public class FuncionarioAutenticado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 120)
	private String nome;

	@Column(nullable = false, length = 20, unique = true)
	private String nif;

	@Column(nullable = false)
	private boolean ativo = true;

	public FuncionarioAutenticado() {}

	public FuncionarioAutenticado(String nome, String nif) {
		this.nome = nome;
		this.nif = nif;
		this.ativo = true;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}