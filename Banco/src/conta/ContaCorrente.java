package conta;

public class ContaCorrente extends Conta{
	private double saldo;
	private double chequeEspecial = 1000;
	
	public ContaCorrente(double chequeEspecial) {
		super();
		this.chequeEspecial = chequeEspecial;
	}
	
	@Override
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
		else if((saldo < valor) && (chequeEspecial >= (valor - saldo))) {
			chequeEspecial -= valor - saldo;
			saldo = 0;
		}
		else {
			System.out.println("Você não possui saldo suficiente");
		}
	}
	
	public String getSaldoComChequeEspecial() {
		return "Saldo: " + saldo + " Cheque Especial: " + this.chequeEspecial;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
}
