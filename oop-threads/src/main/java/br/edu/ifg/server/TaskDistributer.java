package br.edu.ifg.server;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TaskDistributer implements Runnable{

	private Socket socket;

	public TaskDistributer(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		Scanner comando;
		try {
			comando = new Scanner(socket.getInputStream());
			System.out.println("comando recebido na porta : " + socket.getPort() + ": " + comando.nextLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



//int count = 1;
//while(count <= 10) {
//	System.out.println("[" +count+ "] o cliente com cnx na porta " + socket.getPort() + " está executando algo");
//	try {
//		Thread.sleep(10000);
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
//	count++;
//}