package br.edu.ifg.factory;


public class VeiculoFactory {

	
	public static Veiculo create(int numeroRodas) {
		if(numeroRodas == 4) {
			return new Carro();
		}
		if(numeroRodas > 4) {
			return new Caminhao();
		}
		throw new RuntimeException("parametro inválido");
	} 
}
