package br.edu.ifg;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Programa {
	
	
	private static void insere(Aluno aluno) {
		PreparedStatement ps;
		try {
			ps = BancoDeDados.getConnection().prepareStatement("insert into alunos(matricula, nome, data_nascimento, sexo) values(?,?,?,?)");
			
			ps.setString(1, aluno.getMatricula());
			ps.setString(2, aluno.getNome());
			
			
			java.util.Date dataTemp = new SimpleDateFormat("yyyy-MM-dd").parse(aluno.getDataNascimento().toString());
			Date dataNascimento = new Date(dataTemp.getTime());
			
			ps.setDate(3, dataNascimento);
			ps.setString(4, aluno.getSexo());
			
			ps.execute();
		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void atualiza(Aluno aluno) {
		PreparedStatement ps;
		try {
			ps = BancoDeDados.getConnection().prepareStatement("update alunos set matricula = ?, nome = ?, data_nascimento = ?, sexo = ?"
					+ " where id = ?");
			
			ps.setString(1, aluno.getMatricula());
			ps.setString(2, aluno.getNome());
			
			java.util.Date dataTemp = new SimpleDateFormat("yyyy-MM-dd").parse(aluno.getDataNascimento().toString());
			Date dataNascimento = new Date(dataTemp.getTime());
			
			ps.setDate(3, dataNascimento);
			ps.setString(4, aluno.getSexo());
			ps.setLong(5, aluno.getId());
			
			ps.execute();
		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		}
	}
	
	private static void exclui(Long id) {
		PreparedStatement ps;
		try {
			ps = BancoDeDados.getConnection().prepareStatement("delete from alunos where id = ?");
			ps.setLong(1, id);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static List<Aluno> lista(){
		List<Aluno> alunos = new ArrayList<Aluno>();
		try {
			PreparedStatement ps = BancoDeDados.getConnection().prepareStatement("select * from alunos");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				LocalDate dataNascimento = LocalDate.parse(rs.getString(4));
				Aluno aluno = new Aluno(rs.getString(2), rs.getString(3), dataNascimento, rs.getString(5));
				alunos.add(aluno);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alunos;
	}
	
	
	public static void main(String[] args){
//		insere(new Aluno("123456", "Pedro", LocalDate.parse("2000-05-30"), "M"));
//		System.out.println("pronto");
		
		System.out.println("------------- antes da atualizacao -------------------------\n");
		
		List<Aluno> lista = lista();
		lista.forEach(a -> {
			System.out.println(a.getMatricula().concat(" " + a.getNome()));
		});
		
		System.out.println("\n\n------------- após a atualizacao -------------------------\n");
		
		atualiza(new Aluno(2L, "123", "kenyo", LocalDate.parse("1980-02-25"), "M"));
		atualiza(new Aluno(3L, "90890787", "jean carlos", LocalDate.parse("2003-02-25"), "M"));
		
		lista = lista();
		lista.forEach(a -> {
			System.out.println(a.getMatricula().concat(" " + a.getNome()));
		});
		
		System.out.println("\n\n------------- após a exclusão -------------------------\n");
		
		exclui(2L);
		
		lista = lista();
		lista.forEach(a -> {
			System.out.println(a.getMatricula().concat(" " + a.getNome()));
		});
	}
}
