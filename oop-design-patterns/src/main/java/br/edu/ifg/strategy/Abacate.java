package br.edu.ifg.strategy;

public class Abacate implements Tributavel{

	private double preco;
	
	public Abacate(double preco) {
		this.preco = preco;
	}
	
	public double calculaImposto() {
		return preco * 0.05;
	}

}
