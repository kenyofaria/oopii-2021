package br.edu.ifg.persistence;

import java.sql.Connection;
import java.util.List;

import br.edu.ifg.entity.Aluno;

/**
 * precisa realizar operacoes APENAS de persistencia.
 * @author kenyo
 *
 */
public class AlunoDAO {

	private Connection conexao = null;
	
	public AlunoDAO() {
		conexao = BancoDeDados.getConnection();
	}
	
	public void inserir(Aluno aluno) {
		//codigo para realizar insercao de um aluno por meio de um PreparedStatement
	}
	
	public void atualizar(Aluno aluno) {
		//codigo para realizar atualizacao de um aluno por meio de um PreparedStatement
	}
	
	public void excluir(Aluno aluno) {
		//codigo para realizar exclusao de um aluno por meio de um PreparedStatement
	}
	
	public Aluno carregar(Long id) {
		return null;
	}
	
	public List<Aluno> carregar() {
		return null;
	}
}
