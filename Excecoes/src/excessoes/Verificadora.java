package excessoes;

public class Verificadora {
	
	public void verificarNome(Produto prod) {
		if(prod.nome == null || prod.nome == "") {
			throw new EmptyStringException("nome");
		}
	}
	
	public void naoVerificavel() {
		throw new RuntimeException();
	}
	
	public void verificavel() throws Exception {
		Exception ex = new Exception();
		throw ex;
	}
}
