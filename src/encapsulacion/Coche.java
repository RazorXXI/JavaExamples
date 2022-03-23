package encapsulacion;

//Ejemplo de la clase Coche con diferentes modificadores de acceso
public class Coche {
	protected String color; 	//Acceso tipo protected
	private int precio;		//Acceso tipo private
	int velocidadPunta;		//Acceso tipo default
	public String matricula;	//Acceso tipo public
	
	public Coche(String color, int precio, int velocidadPunta, String matricula) {
		super();
		this.color = color;
		this.precio = precio;
		this.velocidadPunta = velocidadPunta;
		this.matricula = matricula;
	}
	
	public int getPrecio() {
		return this.precio;
	}
}
