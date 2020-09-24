package factory;

public class Programa {
	public static void main(String[] args) {
		FabricaFormas ff = new FabricaFormas();
		
		FormaGeometrica circulo = ff.getForma("circulo");
		circulo.draw();
		
		FormaGeometrica quadrado = ff.getForma("quadrado");
		quadrado.draw();
		
		FormaGeometrica triangulo = ff.getForma("triangulo");
		triangulo.draw();
	}
}
