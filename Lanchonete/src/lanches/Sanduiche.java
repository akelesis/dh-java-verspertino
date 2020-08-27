package lanches;

public class Sanduiche extends Lanche{
	private final int tempoPreparo = 15;
	private String[] ingredientes = new String[10];
	
	@Override
	public int calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + tempoPreparo;
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
}
