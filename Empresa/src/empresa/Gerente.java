package empresa;

public class Gerente extends Administrativo{
	private final double bonificacao = 0.12;
	
	
	public Gerente(Funcionario func, String cpf) {
		super(func, cpf);
	}
	
	public double getSalario() {
		return super.getSalario() + (bonificacao * super.getSalario());
	}
	
	@Override
	public void demitir(Funcionario func) {
		if(!(func instanceof Gerente)) {
			System.out.println("Demitido!");
		}
	}
}
