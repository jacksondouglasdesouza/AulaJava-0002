package br.com.treina.javaoo.main;

import br.com.treina.javaoo.classes.Veiculo;

public class main {

	public static void main(String[] args) {
		
		Veiculo honda = new Veiculo();
		
		honda.setMarca("Honda Novo");
		honda.setNome("Civic Novo");
		honda.abastecer(10);
		
		
		Veiculo celta = new Veiculo();
		celta.setMarca("Celta Novo");
		celta.setNome("Celtinha Novo");
		celta.abastecer(50);
		
		
		System.out.println("O carro �: " + celta.getNome());
		celta.Ligar();
		System.out.println("Combust�vel do celta: [[ " + celta.getQuantidadeCombustivel() + "]] \n");
		
		System.out.println("O carro 2 �: " + honda.getNome());
		honda.Ligar();
		honda.abastecer(90);
		System.out.println("Combustivel do honda: [[ " + honda.getQuantidadeCombustivel() + " ]] \n");
		
		
		
	}

}
