package introducao;

public class Conta {
	String agencia;
	String numeroConta;
	String titular;
	double saldo;
	
	public void depositar(float valor) {
		saldo += valor;
	}
	
	public void sacar(float valor) {
		if(saldo >= valor) {
			saldo -= valor;			
		}
	}
	
	public void imprimirSaldo() {
		System.out.println("O seu saldo é: R$" + saldo);
	}
	
}
