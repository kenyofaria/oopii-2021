package br.edu.ifg.strategy;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private List<Tributavel> itens = new ArrayList<Tributavel>();
	
	public void adicionaItem(Tributavel item) {
		itens.add(item);
	}
	
	public double calculaTotalImposto() {
		double total = 0;
		for(Tributavel item: itens) {
			total+=item.calculaImposto();
		}
		return total;
	}

}
