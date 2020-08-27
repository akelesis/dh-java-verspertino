package lanches;

import java.util.Scanner;

public class Programa {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Lanche lanche;
		int opcao;
		
		System.out.println("Bem vindo(a) ao delivery\n\n");
		System.out.println("Selecione o seu lanche");
		System.out.println("[1] sanduiches    [2] bolos");
		
		opcao = teclado.nextInt();
		while(opcao != 1 && opcao != 2) {
			System.out.println("Opção invalida, tente novamente!\n\n");
			System.out.println("Selecione o seu lanche");
			System.out.println("[1] sanduiches    [2] bolos");
			opcao = teclado.nextInt();
			
		}
		
		if(opcao == 1) {
			teclado.nextLine();
			lanche = new Sanduiche();
			menuSanduiche((Sanduiche) lanche);
		}
		if(opcao == 2) {
			menuBolo();
		}
	}
	
	public static void menuSanduiche(Sanduiche lanche) {
		String[] ingredientes = new String[10];
		String ingrediente;
		int i = 0;
		
		System.out.println("Você selecionou sanduíche");
		
		System.out.println("Digite o ingrediente desejado");
		ingrediente = teclado.nextLine();
		while(i < 10 && ingrediente != "0") {
			ingredientes[i] = ingrediente;
			System.out.println("Digite o ingrediente desejado");
			ingrediente = teclado.nextLine();
			i++;
		}
	}
	
	public static void menuBolo() {
		System.out.println("Você selecionou bolo");
		System.out.println("Esta opção está indisponivel no momento!");
	}
}
