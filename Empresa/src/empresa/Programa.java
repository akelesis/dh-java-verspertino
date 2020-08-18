package empresa;

//import java.util.ArrayList;

public class Programa {
	public static void main(String[] args) {
		//Funcionario func = new Funcionario("José Pereira", 2000);
		//PessoaFisica pf = new PessoaFisica(func, "000.000.000-00");
		Supervisor supervisor = new Supervisor(new Funcionario(), "000.000.000-55");
		
		Gerente g1 = new Gerente(new Funcionario(), "000.000.000-45");
		
		g1.demitir(supervisor);
		
//		ArrayList<Funcionario> funcionarios = new ArrayList<>();
//		funcionarios.add(func);
//		funcionarios.add(pf);
//		funcionarios.add(g1);
//		
//		System.out.println(func.getNome() + " " + func.getSalario());
//		func.setSalario(2500);
//		System.out.println(func.getNome() + " " + func.getSalario());
//		//System.out.println(func2.nome + " " + func2.salario);
//		
//		Gerente gerenteMarketing = new Gerente(new Funcionario("Pedro Henrique", 4000), "000.000.000-00", 0.12);
//		
//		gerenteMarketing.setSalario(3000);
//		System.out.println(gerenteMarketing.getSalario());
		
		/*gerenteMarketing.salario = 3500;
		System.out.println(gerenteMarketing.salario + (gerenteMarketing.bonificacao * gerenteMarketing.salario));*/
	}
}
