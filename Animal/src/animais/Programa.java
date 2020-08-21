package animais;

public class Programa {
	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		Cachorro c2 = c1;
		
		System.out.println(c1.equals(c2));
		
		c1.setNome("Bidu");
		
		c1.comer("carne");
		c1.comer();
		
		System.out.println(c2.getNome());
	}
}
