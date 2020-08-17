package introducao;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		
		ContaCorrente contaTeste = new ContaCorrente();
		Poupanca poupancaTeste = new Poupanca();
		
		List<Conta> contas = new ArrayList<>();
		
		contas.add(contaTeste);
		contas.add(poupancaTeste);
		
		contaTeste.chequeEspecial = 1500;
		contaTeste.depositar(500);
		contaTeste.sacar(1600);
		contaTeste.imprimirSaldo();
		
		poupancaTeste.depositar(350);
		

	}
}
