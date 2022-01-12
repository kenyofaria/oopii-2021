package br.edu.ifg.client;

import java.io.PrintStream;
import java.net.Socket;
import java.util.concurrent.ThreadLocalRandom;

public class ClientAgent {

	public static void main(String[] args) throws Exception {
		Socket socketClient = new Socket("localhost", 10000);
		System.out.println("CLIENT: conexao estabelecida");
		Thread.sleep(10000);
		System.out.println("enviando");
		PrintStream ps = new PrintStream(socketClient.getOutputStream());
		ps.println( + ThreadLocalRandom.current().nextInt(1, 100));
		//socketClient.close();
	}
}
