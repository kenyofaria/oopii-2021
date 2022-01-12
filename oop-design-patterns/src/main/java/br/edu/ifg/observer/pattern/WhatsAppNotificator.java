package br.edu.ifg.observer.pattern;

public class WhatsAppNotificator extends Observer{

	@Override
	public void sendMessage(String message) {
		System.out.println("seding message by whats up service");
		System.out.println(message + " sent");
		
	}

}
