package br.edu.ifg.observer;

import br.edu.ifg.observer.pattern.EmailNotificator;
import br.edu.ifg.observer.pattern.SmsNotificator;
import br.edu.ifg.observer.pattern.WhatsAppNotificator;

public class Main {

	public static void main(String[] args) {
		Order ps = new Order();
		
		ps.addObserver(new SmsNotificator());
		ps.addObserver(new EmailNotificator());
		ps.addObserver(new WhatsAppNotificator());
		
		System.out.println(" stage 1 ----------------------------------------- ");
		ps.setState(StateOrder.VERIFY);
		
		sleep();
		
		System.out.println("\n\n\n stage 2 ----------------------------------------- ");
		ps.setState(StateOrder.PAY);
		
		sleep();
		
		System.out.println("\n\n\n stage 3 ----------------------------------------- ");
		ps.setState(StateOrder.DELIVERY);

	}
	
	private static void sleep() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
