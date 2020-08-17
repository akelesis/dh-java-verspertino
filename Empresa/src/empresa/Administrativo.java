package empresa;

public class Administrativo extends PessoaFisica {
	double bonificacao;
	
	public Administrativo(Funcionario func, String cpf) {
		super(func, cpf);
	}
}
