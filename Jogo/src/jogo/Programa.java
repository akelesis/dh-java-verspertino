package jogo;

public class Programa {
	public static void main(String[] args) {
		
		Jogador player = new Jogador();
		
		player.arma = new Pistola();
		
		player.arma.atirar();
		player.arma.atirar();
		player.arma.atirar();
		player.arma.atirar();
		player.arma.atirar();
		player.arma.recarregar();
		player.arma.atirar();
		player.arma.atirar();
		player.arma.recarregar();
		player.arma.recarregar();
		
		Pistola pistola = (Pistola) player.arma;
		pistola.tempo = 500;
		
		System.out.println(((Pistola) player.arma).getTempo() + " segundos");
		
	}
}
