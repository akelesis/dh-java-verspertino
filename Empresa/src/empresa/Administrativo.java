package empresa;

public class Administrativo extends PessoaFisica {
	
	public Administrativo(Funcionario func, String cpf) {
		super(func, cpf);
	}
	
	public void demitir(Funcionario func) {
		if(!(func instanceof Administrativo)) {
			System.out.println("Demitido");
		}
		else {
			System.out.println("Você não tem autorização para demitir este funcionario!");
		}
	}
	
}
