package br.edu.ifg.service;

import java.time.LocalDate;
import java.time.Period;

import br.edu.ifg.entity.Aluno;
import br.edu.ifg.persistence.AlunoDAO;

/**
 * objetivo de garantir as regras de negócio relacionadas aos alunos
 * @author kenyo
 *
 */
public class AlunoService {

	private AlunoDAO alunoDAO;
	
	public AlunoService() {
		this.alunoDAO = new AlunoDAO();
	}
	
	public void cadastroAluno(Aluno aluno) {
		int idade = Period.between(aluno.getDataNascimento(), LocalDate.now()).getYears();
		if(idade >= 18) {
			this.alunoDAO.inserir(aluno);
		}else {
			throw new RuntimeException("aluno deve ser maior de idade");
		}
	}
}
