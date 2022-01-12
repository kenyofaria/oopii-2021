package br.edu.ifg.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAgent {

	
	public static void main(String[] args) throws IOException {
		System.out.println("SERVER: servidor em execucao e escutando na porta 10000");
		ServerSocket serverSocket = new ServerSocket(10000);
		while(true) {
			Socket socket = serverSocket.accept();
			//System.out.println("SERVER: cliente conectado na porta: " + socket.getPort());
			TaskDistributer task = new TaskDistributer(socket);
			Thread thread = new Thread(task);
			thread.start();
		}
		//serverSocket.close();
	}
}
