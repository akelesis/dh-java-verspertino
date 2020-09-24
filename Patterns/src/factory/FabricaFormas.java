package factory;

public class FabricaFormas {
	public FormaGeometrica getForma(String tipoForma) {
		switch(tipoForma) {
			case "circulo":
				return new Circulo();
			case "quadrado":
				return new Quadrado();
			case "retangulo":
				return new Retangulo();
			case "triangulo":
				return new Triangulo();
			default:
				return null;
		}
	}
}
