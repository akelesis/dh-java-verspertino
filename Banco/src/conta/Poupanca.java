package conta;

public final class Poupanca extends Conta {
	private double saldo;
	
	@Override
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
}
