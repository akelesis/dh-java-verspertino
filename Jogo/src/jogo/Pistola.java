package jogo;

public class Pistola implements Arma{
	int municao = 4;
	int tempo = 0;
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public void atirar() {
		System.out.println("Pei");
		this.municao -= 1;
		
	}
	@Override
	public void recarregar() {
		System.out.println("Recarregando...");
		this.municao = 20;
		this.tempo += 5;
	}
	
	
}
