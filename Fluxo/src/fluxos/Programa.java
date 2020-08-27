package fluxos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Programa {
	public static void main(String[] args) {		
		Consumer<Produto> println = preco -> System.out.println(preco);
		Consumer<String> print = preco -> System.out.println(preco);
		
		Produto p1 = new Produto("Computador", 2800);
		Produto p2 = new Produto("Tablet", 1000);
		Produto p3 = new Produto("Celular", 1850);
		Produto p4 = new Produto("Notebook", 3789);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		Cliente c1 = new Cliente("Paula", 21);
		Cliente c2 = new Cliente("Luciano", 74);
		Cliente c3 = new Cliente("Vinicius", 45);
		Cliente c4 = new Cliente("Juliana", 50);
		
		List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4);
		
		Compra cp1 = new Compra(p1, c2);
		Compra cp2 = new Compra(p2, c3);
		Compra cp3 = new Compra(p3, c1);
		Compra cp4 = new Compra(p4, c2);
		Compra cp5 = new Compra(p1, c4);
		
		List<Compra> compras = Arrays.asList(cp1, cp2, cp3, cp4, cp5);
		
//		System.out.println(produtos.stream().noneMatch(prod -> prod.preco < 900));
		
//		Comparator<Integer> maior = (num1, num2) -> {
//			if(num1 > num2) return 1;
//			if(num1 < num2) return -1;
//			return 0;
//		};
//		
//		List<Integer> nums = Arrays.asList(12, 67, 44, 36, 52, 87, 99);
//		
//		nums.stream().max(maior).ifPresent(System.out::println);
		
		produtos.stream()
			.filter(prod -> prod.preco > 1000)
			.forEach(println);
		
		clientes.stream()
			.map(cliente -> cliente.nome)
			.forEach(nome -> System.out.println(nome));
		
		compras.stream()
			.map(compra -> compra.produto)
			.map(produto -> produto.preco)
			.reduce((total, atual) -> total + atual)
			.ifPresent(System.out::println);
		
		compras.stream()
			.filter(compra -> compra.cliente.nome.equals("Juliana"))
			.map(compra -> compra.produto.preco)
			.reduce((total, atual) -> total + atual)
			.ifPresent(System.out::println);
	}
}
