package br.edu.ifg.observer.pattern;

public class EmailNotificator extends Observer{

	@Override
	public void sendMessage(String message) {
		System.out.println("seding message by email");
		System.out.println(message + " sent");
	}

}
