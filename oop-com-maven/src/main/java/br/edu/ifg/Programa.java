package br.edu.ifg;

import java.util.List;

import br.edu.ifg.entity.Aluno;
import br.edu.ifg.entity.Disciplina;
import br.edu.ifg.entity.Turma;
import br.edu.ifg.service.AlunoService;
import br.edu.ifg.service.DisciplinaService;
import br.edu.ifg.service.TurmaService;

public class Programa {
	
	public static void main(String[] args) {

		AlunoService alunoService = new AlunoService();
		Aluno aluno = alunoService.carregaAluno(2L);
		
		DisciplinaService disciplinaService = new DisciplinaService();
		Disciplina disciplina = disciplinaService.carregaDisciplina("calculo II");
		
		TurmaService turmaService = new TurmaService();
		List<Turma> turmas = turmaService.turmasDisponiveis(disciplina);
		
		
		disciplinaService.matriculaAluno(aluno, disciplina, turmas.get(2));
	}
}
