package introducao;

public class ContaCorrente extends Conta {
	float pacoteDeServico = 20;
	float chequeEspecial = 1000;
	
	public void virarMes() {
		saldo -= pacoteDeServico;
	}
	
	public void sacar(float valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
		else if(saldo > 0 && saldo < valor && chequeEspecial >= (valor-saldo)) {
			valor -= saldo;
			saldo = 0;
			chequeEspecial -= valor;
		}
		else {
			System.out.println("Voc� n�o possui saldo suficiente!");
		}
		
		
	}
	
	public void imprimirSaldo() {
		System.out.println("O saldo da conta corrente � R$" + saldo);
		System.out.println("O cheque especial da conta corrente � R$" + chequeEspecial);
	}
}
