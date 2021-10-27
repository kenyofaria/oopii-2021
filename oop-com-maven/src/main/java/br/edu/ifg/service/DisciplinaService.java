package br.edu.ifg.service;

import br.edu.ifg.entity.Aluno;
import br.edu.ifg.entity.Disciplina;
import br.edu.ifg.entity.Turma;
import br.edu.ifg.exception.ServiceException;
import br.edu.ifg.persistence.DisciplinaDAO;
import br.edu.ifg.persistence.TurmaDAO;

public class DisciplinaService {

	private TurmaDAO turmaDAO;
	private DisciplinaDAO disciplinaDAO;
	
	public DisciplinaService() {
		this.turmaDAO = new TurmaDAO();
	}
	
	public void matriculaAluno(Aluno aluno, Disciplina disciplina, Turma turma) {
		 //implementar uma forma de verificar sobre as notas do aluno. Pré-requisitos, etc.
		 boolean notasOK = false;
		 //implementar uma forma de verificar se o aluno está adimplente
		 boolean adimplente = false;
		 //verificar a disponibildiade da disciplina. Se há turmas com vagas
		 boolean existeVaga = false;
		 //verificar possiveis colisoes de horario com outra disciplina
		 boolean naoExisteColisao = false;
		 
		 if(!notasOK) {
			 throw new ServiceException("aluno com problema de nota ou pré-requisito");
		 }
		 if(!adimplente) {
			 throw new ServiceException("aluno inadimplente");
		 }
		 if(!existeVaga) {
			 throw new ServiceException("nao há mais vagas nesta disciplina"); 
		 }
		 if(!naoExisteColisao) {
			 throw new ServiceException("existe colisao"); 
		 }
			 
		 turma.matriculaAluno(aluno);
		 turmaDAO.atualizar(turma);
	}
	
	public Disciplina carregaDisciplina(String nome) {
		return this.disciplinaDAO.get(nome);
	}
}
