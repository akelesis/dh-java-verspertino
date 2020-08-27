package excessoes;

public class Programa {
	public static void main(String[] args) {
		Produto prod1 = new Produto();
		Verificadora verif = new Verificadora();
		
//		prod1.nome = "Arroz";
		
		try {
			verif.verificarNome(prod1);			
		}
		catch(NullPointerException e) {
			System.out.println("O produto est� nulo!");
		}
		
		try {
			System.out.println(1/0);			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("O produto est� nulo!");
		}
		
		
		try {
			verif.naoVerificavel();	
			verif.verificavel();			
		}
		catch(RuntimeException e) {
			System.out.println("Runtime tratada!");
		}
		catch(Exception e) {
			System.out.println("Exce��o tratada!");
		}
		
		
		System.out.println("Parab�ns, voc� conseguiu tratar todas as exce��es!");
	}
}
