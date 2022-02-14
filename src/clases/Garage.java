package clases;

public class Garage {

	//Declaración de Constantes
	private static final int _NUM_PLAZAS_DEFAULT = 60;
	
	//Declaracion de atributos
	private Plaza[] plazas;
	private int numPlazas;
	
	//Declaración de métodos
	
	//Constructor con parametros
	public Garage(int numPlazas) {
		this.numPlazas = numPlazas;
		this.plazas = new Plaza[numPlazas];
	}
	
	//Constructor por defecto
	public Garage() {
		this.numPlazas = _NUM_PLAZAS_DEFAULT;
		this.Plazas = new Plaza[numPlazas]; 
	}
}
