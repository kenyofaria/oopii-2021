package br.edu.ifg.singleton;

import java.sql.Connection;

public class Main {

	
	public static void main(String[] args) {
		DataBase dataBase = DataBase.getInstance();
		dataBase.fazAlgo();
		
		Connection connection = DataBase.getConnection();
		System.out.println("conexao aberta");
	}
}
