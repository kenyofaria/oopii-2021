package br.edu.ifg;

import java.time.LocalDate;

public class Aluno {
	
	//matricula, nome, data_nascimento, sexo
	
	private Long id;
	private String matricula;
	private String nome;
	private LocalDate dataNascimento;
	private String sexo;
	
	
	
	public Aluno(Long id, String matricula, String nome, LocalDate dataNascimento, String sexo) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}
	
	public Aluno(String matricula, String nome, LocalDate dataNascimento, String sexo) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public Long getId() {
		return id;
	}
}
