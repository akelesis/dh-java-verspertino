package animais;

public interface Animal {

	void mover();
	
	void comer();
	
	default void respirar() {
		System.out.println("est� respirando oxig�nio");
	}
	
}
