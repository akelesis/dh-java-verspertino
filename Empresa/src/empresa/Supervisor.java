package empresa;

public class Supervisor extends Administrativo{

	public Supervisor(Funcionario func, String cpf, double bonificacao) {
		super(func, cpf);
		this.bonificacao = bonificacao;
	}
	
}
