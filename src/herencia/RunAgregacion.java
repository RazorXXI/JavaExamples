package herencia;

public class RunAgregacion {

	public static void main(String[] args) {
		
		CentroComercial centroComercial = new CentroComercial();
		
		Cliente cliente1 = new Cliente("Juan", 50);
		Cliente cliente2 = new Cliente("Manuel", 100);
		
		centroComercial.construirTienda();
		
		centroComercial.entraCliente(cliente1);
		centroComercial.entraCliente(cliente2);
		
		centroComercial = null;
		//Si destruimos el objeto centroComercial, no se destruyen los objetos Cliente
	}
}