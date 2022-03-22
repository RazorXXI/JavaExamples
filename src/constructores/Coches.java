package constructores;

public class Coches {
	private String marca;
	private String modelo;
	private int precio;


	//Método constructor
	//El constructor no devuelve nada dado que lo que hace es reservar espacio en memoria para un objeto de su clase
	// Coches(){
	// 	this.marca = "";
	// 	this.modelo = "";
	// 	this.precio = 0;
	// }

	//Otra manera de emplear el constructor por defecto
	//De esta forma llamamos al constructor sobrecargado que tenemos debajo
	public Coches() {
		this("Seat", "Ibiza");
	}

	//Sobrecarga del método constructor
	public Coches(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = 0;
	}
	
	//Sobrecarga del metodo constructor	
	public Coches(String marca, String modelo, int precio) {
		//Se usa this para identificar a los atributos de la clase con respecto a los parámetros del constructor
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}