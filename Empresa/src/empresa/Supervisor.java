package empresa;

public class Supervisor extends Administrativo{
	private final double bonificacao = 0.08;
	
	public Supervisor(Funcionario func, String cpf) {
		super(func, cpf);
	}
	
}
