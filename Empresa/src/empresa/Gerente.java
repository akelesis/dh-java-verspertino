package empresa;

public class Gerente extends Administrativo{
	
	public Gerente(Funcionario func, String cpf, double bonificacao) {
		super(func, cpf);
		bonificacao = 0.12;
	}
	
	public double getSalario() {
		return super.getSalario() + (bonificacao * super.getSalario());
	}
}
