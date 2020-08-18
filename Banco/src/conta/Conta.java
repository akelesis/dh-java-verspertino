package conta;

public abstract class Conta {
	private String cliente;
	private String numeroConta;
	private String agencia;

	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		if(cliente.length() > 0) {
			this.cliente = cliente;			
		}
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public final String getAgencia() {
		return agencia;
	}
	
	public abstract void sacar(double valor);
	
	public abstract void depositar(double valor);
	
	
}
