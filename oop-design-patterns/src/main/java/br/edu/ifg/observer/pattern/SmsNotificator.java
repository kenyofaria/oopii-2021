package br.edu.ifg.observer.pattern;

public class SmsNotificator extends Observer{

	@Override
	public void sendMessage(String message) {
		System.out.println("seding message by sms service");
		System.out.println(message + " sent");
		
	}

}
