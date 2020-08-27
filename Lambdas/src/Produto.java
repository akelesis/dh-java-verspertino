
public class Produto {
	String nome;
	double preco;
	
	public static void printPrecoComDesconto(double preco) {
		System.out.println(preco * (1 - 0.1));
	}
}
