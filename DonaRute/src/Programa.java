import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//import java.util.Queue;
import java.util.Stack;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

public class Programa {
	public static void main(String[] args) {
		Stack<String> livros = new Stack<>();
		
		livros.push("Harry Potter e a Camara Secreta");
		livros.push("Cinquenta Tons de Cinza");
		livros.push("C�digo Limpo");
		
		System.out.println(livros);
		
		String livroTopo = livros.peek();
		
		livros.push("Arquitetura Limpa");
		
		System.out.println(livros);
		System.out.println(livroTopo);
		
		
		
//		Queue<String> pessoas = new LinkedList<>();
//		
//		pessoas.add("Jo�o");
//		pessoas.add("Maria");
//		pessoas.add("Gabi");
//		
//		System.out.println(pessoas.poll());
//		System.out.println(pessoas.poll());
//		System.out.println(pessoas.poll());
//		System.out.println(pessoas.remove());
		
		
//		Map<String, String> ingredientes = new HashMap<>();
		
//		ingredientes.add(new Produto("Farinha de trigo", 3.50, "1kg"));
//		ingredientes.add(new Produto("Ovo", 9.50, "30 un"));
//		ingredientes.add(new Produto("Manteiga", 3.50, "1kg"));
//		ingredientes.add(new Produto("Fermento", 3.50, "1kg"));
//		ingredientes.add(new Produto("Fermento", 3.50, "1kg"));
		
//		ingredientes.put("Junior", "Leite");
//		ingredientes.put("Seu Geraldo", "Fu�");
//		ingredientes.put("Dona Rute", "Esp�tula");
//		
		
//		ingredientes.add("Manteiga");
//		ingredientes.add("A�ucar");
//		ingredientes.add("Ovo");
//		ingredientes.add("Farinha de trigo");
//		ingredientes.add("fermento");
//		ingredientes.add("leite condensado");
//		ingredientes.add("c�co");
//		ingredientes.add("barra de chocolate");
//		ingredientes.add("creme de leite");
		
//		System.out.println(ingredientes.contains(new Produto("Ovo", 9.50, "30 un")));
		
//		for(String chave : ingredientes.keySet()) {
//			System.out.println(ingredientes.get(chave));
//		}
	}
}
