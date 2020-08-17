package introducao;

public class Poupanca extends Conta{
	float rendimento = 0.01f;
	
	public void virarMes() {
		saldo += (saldo * rendimento);
	}
	
	public void imprimirSaldo() {
		System.out.println("O saldo da conta poupança é R$" + saldo);
	}
}
