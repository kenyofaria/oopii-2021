package br.edu.ifg.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.List;

import br.edu.ifg.entity.Aluno;
import br.edu.ifg.entity.Disciplina;
import br.edu.ifg.exception.ServiceException;
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
			throw new ServiceException("aluno deve ser maior de idade");
		}
	}
	
	public List<Disciplina> listaDisciplinasMatriculadas(Aluno aluno){
	
		boolean inadimplemnte = true;
		//é necessário implementar algo que check se o aluno está inadimplente ou nao
		if(inadimplemnte) {
			throw new ServiceException("aluno está inadimplente");
		}
		return null; //é necessário implementar a busca das disciplinas em que o aluno está matriculado
	}
	
	public Aluno carregaAluno(Long id) {
		return this.alunoDAO.get(id);
	}
	
	public List<Aluno> carregaAlunos(){
		return this.alunoDAO.list();
	}
	
	
	public static void main(String[] args) {
		AlunoService alunoService = new AlunoService();
		List<Aluno> listaDeAlunos = alunoService.carregaAlunos();
		
		System.out.println("--------------------- iterando da forma convencional ---------------------");
		for(int i=0; i<listaDeAlunos.size(); i++) {
			System.out.println(listaDeAlunos.get(i).getNome());
		}
		
		System.out.println("\n\n\n--------------------- iterando com iterator ---------------------");
		Iterator<Aluno> iterator = listaDeAlunos.iterator();
		while(iterator.hasNext()) {
			Aluno aluno = iterator.next();
			if(aluno.getNome().equalsIgnoreCase("jean"))
				listaDeAlunos.remove(iterator);
			else System.out.println(aluno.getNome());
		}
		
		System.out.println("\n\n\n--------------------- iterando com foreach ---------------------");
		for (Aluno aluno : listaDeAlunos) {
			System.out.println(aluno.getNome());
		}
		
		System.out.println("\n\n\n--------------------- iterando com lambda ---------------------");
		listaDeAlunos.forEach(aluno -> System.out.println(aluno.getNome()));
	}
}
