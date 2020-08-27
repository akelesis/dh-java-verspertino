import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Programa {
	public static void main(String[] args) {
		BinaryOperator<Double> soma = (x, y) -> x + y;
		BinaryOperator<Double> multiplicacao = (x, y) -> x * y;
		Consumer<String> print = System.out::println;
		Consumer<Double> printPreco = Produto::printPrecoComDesconto;
		
		List<String> nomes = new ArrayList<>();
		
		
		
		nomes.add("Luciano");
		nomes.add("Maína");
		nomes.add("Luan");
		nomes.add("Hakney");
		nomes.add("Allen");
		
		nomes.forEach(print);
		

		System.out.println(soma.apply(3.0, 4.0));
		System.out.println(multiplicacao.apply(3.0, 4.0));
		
	}
	
	public static void printNome(String nome) {
		System.out.println("Olá, meu nome é " + nome);
	}
}
