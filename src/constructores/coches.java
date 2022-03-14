package constructores;

import java.util.*;

public class coches {
	private String marca;
	private String modelo;
	private int precio;


	//Método constructor
	//El constructor no devuelve nada dado que lo que hace es reservar espacio en memoria para un objeto de su clase
	// coches(){
	// 	this.marca = "";
	// 	this.modelo = "";
	// 	this.precio = 0;
	// }

	//Otra manera de emplear el constructor por defecto
	//De esta forma llamamos al constructor sobrecargado que tenemos debajo
	coches() {
		this("Seat", "Ibiza");
	}

	//Sobrecarga del método constructor
	coches(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = 0;
	}
	
	//Sobrecarga del metodo constructor	
	coches(String marca, String modelo, int precio) {
		//Se usa this para identificar a los atributos de la clase con respecto a los parámetros del constructor
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	
}