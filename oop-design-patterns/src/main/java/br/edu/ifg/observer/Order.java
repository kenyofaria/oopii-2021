package br.edu.ifg.observer;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifg.observer.pattern.Observer;

/**
 * the subject
 * @author kenyo
 *
 */
public class Order {

	private List<Observer> observers = new ArrayList<Observer>();
	private String message = "";
	
	public void setState(StateOrder stateOrder) {
		
		switch (stateOrder.toString()) {
			case "DELIVERY":
				message = "your order got away";
				break;
	
			case "VEFIFY":
				message = "your order is in verifing stage process";
				break;
				
			case "PAY":
				message = "your pay was approved";
				break;
				
			default:
				message = "";
				break;
		}
		
		notifyAllObservers();
	}
	private void notifyAllObservers() {
		observers.forEach(observer -> {
			observer.sendMessage(message);
		});
		
	}
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
}
