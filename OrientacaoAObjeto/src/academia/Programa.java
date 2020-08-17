package academia;

public class Programa {
	public static void main(String args[]) {
		Cliente c1 = new Cliente();
		c1.peso = 90;
		System.out.println(c1.nome);
		c1.nome = "Julio";
		System.out.println(c1.nome);
		c1.dataNasc = "01/01/2000";
		
		System.out.println(c1.peso);
		c1.malhar();
		c1.malhar();
		c1.malhar();
		c1.malhar();
		c1.malhar();
		System.out.println(c1.peso);
	}
}
