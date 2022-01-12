package br.edu.ifg.strategy;

public class Main {

	

	public static void main(String[] args) {
		Abacate abacate = new Abacate(5);
		Laranja laranja = new Laranja(1);
		Morango morango = new Morango(10);
		Compra compra = new Compra();
		
		compra.adicionaItem(laranja);
		compra.adicionaItem(abacate);
		compra.adicionaItem(morango);
		
		System.out.println(compra.calculaTotalImposto());
		
	}
}
