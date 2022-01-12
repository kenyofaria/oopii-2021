package br.edu.ifg.strategy;

public class Laranja implements Tributavel{

	private double preco;
	
	public Laranja(double preco) {
		this.preco = preco;
	}
	
	public double calculaImposto() {
		return preco*0.03;
	}

}
