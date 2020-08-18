package conta;

public class Programa {
	
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(1000);
		c1.depositar(200);
		c1.sacar(400);
		
		System.out.println(c1.getSaldoComChequeEspecial());
	}
}
