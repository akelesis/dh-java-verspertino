package animais;

public class Cachorro implements Animal, Amigo {
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void mover() {
		System.out.println(nome + " est� se movendo com patas");
	}

	@Override
	public void comer() {
		System.out.println(nome + " est� comendo ra��o");
	}
	
	public void comer(String comida) {
		System.out.println(this.nome + " est� comendo " + comida);
	}

	@Override
	public void brincar() {
		System.out.println(nome + " est� brincando com bola");
		
	}
	
	
}
