package br.edu.ifg.persistence;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.edu.ifg.entity.Aluno;

/**
 * precisa realizar operacoes APENAS de persistencia.
 * @author kenyo
 *
 */
public class AlunoDAO implements DAO<Aluno, Long> {

	private Connection conexao = null;
	
	private List<Aluno> lista = Arrays.asList(
				new Aluno("3423423", "kenyo", LocalDate.now(), "M"),
				new Aluno("5466542", "julio", LocalDate.now(), "M"),
				new Aluno("0988866", "filipe", LocalDate.now(), "M"),
				new Aluno("9239057", "jean", LocalDate.now(), "M"),
				new Aluno("0238978", "gustavo", LocalDate.now(), "M"),
				new Aluno("0102893", "pedro", LocalDate.now(), "M"),
				new Aluno("7783941", "vitor", LocalDate.now(), "M")
			);
	
	
	public AlunoDAO() {
		conexao = BancoDeDados.getConnection();
	}

	@Override
	public Long inserir(Aluno t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno atualizar(Aluno t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> list() {
		return lista;
	}
}
