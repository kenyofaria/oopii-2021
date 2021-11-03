package br.edu.ifg.builder;

public class Main {

	public static void main(String[] args) {
	
		Bike a = new BikeBuilder().make("caloi").color("white").height(29).build();
		System.out.println(a);
		
		Bike b = new BikeBuilder().make("nada").color("red").height(26).build();
		System.out.println(b);
		
		
		Bike c = new BikeBuilder().make("monark").color("green").height(20).build();
		System.out.println(c);
	}
}
