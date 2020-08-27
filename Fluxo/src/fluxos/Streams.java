package fluxos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
//		Stream<String> nomes = Stream.of("Luciano", "Tatiana", "Luan", "Paula");
//		
//		List<String> outrosNomes = Arrays.asList("Maína", "Daniela", "Erika", "Vanderson");
//		Stream<String> streamOutrosNomes = outrosNomes.stream();
//		
//		Consumer<String> println = nome -> System.out.println(nome);
//		
//		nomes.forEach(println);
//		streamOutrosNomes.forEach(println);

		UnaryOperator<Double> aplicarDesconto = preco -> preco * (1 - 0.1);
		Consumer<Double> println = preco -> System.out.println(preco);
		Predicate<Double> baratos = preco -> preco < 2000;
		Predicate<Double> caro = preco -> preco >= 2000;
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Computador", 2800));
		produtos.add(new Produto("Tablet", 1400));
		produtos.add(new Produto("Celular", 1850));
		produtos.add(new Produto("Notebook", 3789));
		
		Stream<Produto> streamProdutos = produtos.stream();
		
		double precoComDesconto = streamProdutos
			.map(prod -> prod.preco)
			.map(aplicarDesconto)
			.filter(baratos)
			.reduce(0.0, (total, atual) -> total + atual);
		
		System.out.println(precoComDesconto);
		
	}
}
