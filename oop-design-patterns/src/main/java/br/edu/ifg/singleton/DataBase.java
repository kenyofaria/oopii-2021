package br.edu.ifg.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

	private static DataBase dataBase = new DataBase();
	private static Connection cnx;

	private DataBase() {
		// TODO Auto-generated constructor stub
	}

	public static DataBase getInstance() {
		return dataBase;
	}

	public static Connection getConnection() {
		if (cnx == null) {
			try {
				String url = "jdbc:postgresql://localhost/jean?user=postgres&password=monalisa";
				cnx = DriverManager.getConnection(url);
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		return cnx;
	}

	public void fazAlgo() {
		System.out.println("fazendo algo");
	}
}
