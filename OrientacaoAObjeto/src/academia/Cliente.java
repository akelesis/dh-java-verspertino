package academia;

public class Cliente extends Pessoa {
	String identificacao;
	double mensalidade;
	double peso;
	
	public void malhar() {
		peso -= (peso * 0.01);
	}
}
