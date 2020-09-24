package mvc;

public class Student {
	private String nome;
	private String matricula;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.equals("José")) {
			this.nome = "Seu" + nome;
		}
		else {
			this.nome = nome;
		}
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
