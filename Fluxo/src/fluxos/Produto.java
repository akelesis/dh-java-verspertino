package fluxos;

public class Produto {
	String nome;
	double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "O produto " + nome + " custa " + preco + "!";
	}
	
	
}
