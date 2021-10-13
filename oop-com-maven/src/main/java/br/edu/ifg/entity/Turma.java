package br.edu.ifg.entity;

import java.time.LocalDate;
import java.util.List;

public class Turma {

	private Long id;
	
	private LocalDate dataInicial;
	
	private LocalDate dataFinal;
	
	private List<Aluno> alunos;
	
	private Disciplina disciplina;
	
	
	public Turma(LocalDate dataInicial, LocalDate dataFinal, List<Aluno> alunos) {
		super();
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.alunos = alunos;
	}

	public Turma() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
