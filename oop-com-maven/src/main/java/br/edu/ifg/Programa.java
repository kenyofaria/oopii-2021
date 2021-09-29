package br.edu.ifg;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {

	
	public static void main(String[] args){
		PreparedStatement ps;
		try {
			ps = BancoDeDados.getConnection().prepareStatement("insert into alunos(matricula, nome, data_nascimento, sexo) values(?,?,?,?)");
			
			ps.setString(1, "2020900");
			ps.setString(2, "kenyo");
			
			java.util.Date dataTemp = new SimpleDateFormat("yyyy-MM-dd").parse("1980-02-25");
			Date dataNascimento = new Date(dataTemp.getTime());
			
			ps.setDate(3, dataNascimento);
			ps.setString(4, "M");
			
			ps.execute();
		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		}
		System.out.println("pronto");
	}
}
