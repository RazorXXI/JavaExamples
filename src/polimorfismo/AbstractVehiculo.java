package polimorfismo;

public abstract class AbstractVehiculo {
	private String tipo;
	
	//Metodos con polimorfismo paramétrico
	public abstract float velocidad();
	public abstract float velocidad(String unidad);
	
	public String tipo() {
		return this.tipo;
	}
}
