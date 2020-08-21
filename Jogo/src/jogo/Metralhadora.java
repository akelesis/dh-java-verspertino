package jogo;

public class Metralhadora implements Arma {
	int municao = 20;
	int tempo = 0;
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public void atirar() {
		if(municao > 0) { 
			System.out.println("tra tra tra tra tra");
			this.municao -= 5;			
		}
		else {
			System.out.println("Você está sem munição");
		}
		
		
	}
	@Override
	public void recarregar() {
		System.out.println("Recarregando...");
		this.municao = 40;
		this.tempo += 7;		
	}
}
