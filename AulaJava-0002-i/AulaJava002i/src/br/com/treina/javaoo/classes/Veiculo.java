package br.com.treina.javaoo.classes;

public class Veiculo {
	
	private String nome;
	private String marca;
	private String chasi;
	private int quantidadeRodas;
	private float quantidadeCombustivel = 0;
	
	
	public String getNome() {          //     POJO...
		return nome;
	}								   // } Set e Get nome.

	public void setNome(String nome) { //
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChasi() {
		return chasi;
	}

	public void setChasi(String chasi) {
		this.chasi = chasi;
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}
	
	
	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	// Ser� eliminado, pois o ve�culo s� poder ter a quantidade de litros do combust�vel alterada, ap�s o chamado do m�todo abastere!
	/*public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}*/

	public void Ligar() {
		System.out.println("O ve�culo est� Ligado!");
	}
	
	public void Desligar() {
		System.out.println("O ve�culo est� deslidado!");
	}
	
	public void abastecer(float litros) {
		quantidadeCombustivel += litros;
	}
		
}


