package br.edu.ifg.strategy;

public class Morango implements Tributavel{

	
	private double preco;

	public Morango(double preco) {
		this.preco = preco;
	}
	
	@Override
	public double calculaImposto() {
		return preco*0.25;
	}

}
