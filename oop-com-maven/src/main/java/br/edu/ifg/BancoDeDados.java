package br.edu.ifg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * tem o objetivo de abrir conexao com um banco de dados postgres por meio de um driver jdbc 
 * @author kenyo
 *
 */
public class BancoDeDados {

	private static Connection cnx = null;
	
	public static Connection getConnection() {
		try {
			cnx = DriverManager.getConnection(
			        "jdbc:postgresql://localhost:5432/oop2", "postgres", "monalisa");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return cnx;
	}
	
}
