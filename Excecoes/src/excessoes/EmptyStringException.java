package excessoes;

@SuppressWarnings("serial")
public class EmptyStringException extends RuntimeException{
	String nomeAtributo;

	public EmptyStringException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	@Override
	public String getMessage() {
		return "o atributo " + nomeAtributo + " está vazio!";
	}
}
