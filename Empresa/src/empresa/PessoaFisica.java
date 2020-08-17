package empresa;

public class PessoaFisica extends Funcionario {
	String cpf;
	
	public PessoaFisica(Funcionario func, String cpf) {
		this.setNome(func.getNome());
		this.setSalario(func.getSalario());
		this.cpf = cpf;
	}
}
