package academia;

public class Pessoa {
	String nome = "Marcus";
	String cpf = "000.000.000-00";
	String rg = "00.000.000-00";
	String dataNasc = "01/10/1994";
	char sexo = 'm';
	
	public String toString() {
		return nome + " " + cpf + " " + rg + " " + dataNasc + " " + sexo;
	}
}
