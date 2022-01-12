package br.edu.ifg.factory;

public class Main {

	
	public static void main(String[] args) {
		
		Veiculo carro = VeiculoFactory.create(4);
		Veiculo caminhao = VeiculoFactory.create(6);
		
		carro.liga();
		System.out.println("\n-----------\n");
		caminhao.liga();
		
		
		Veiculo v = VeiculoFactory.create(1);
	}
}
