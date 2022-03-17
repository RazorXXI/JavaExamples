package polimorfismo;

/*
 * Descripción:
 * 	Clase que hereda de la clase abstracta AbstractVehiculo
 * 
 *  Sus métodos abstractos han sido definidos.
 *  Ejemplo de polimorfismo paramétrico.
 */
public class PatinElectrico extends AbstractVehiculo {

	private float velocidadKmH;
	
	
	@Override
	public float velocidad() {
		
		return this.velocidadKmH;
	}

	@Override
	public float velocidad(String unidad) {
		float velocidad = this.velocidadKmH;
		
		if (unidad.equals("MPH"))
			velocidad = this.velocidadKmH * 1.609f;
		
		return velocidad;
	}
}