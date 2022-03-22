package encapsulacion;

public class RunCoche {

	public static void main(String[] args) {
		Coche miCoche = new Coche("Blanco",35000,180,"H0001A");
		Ford miFocus = new Ford("Rojo", 20000, 190, "0001LKG");
		
		//Accedo al atributo matricula que es público
		System.out.println("Matricula del Vehiculo: " + miCoche.matricula);
		
		//Accedo al atributo color que es de tipo protected, pero como estoy dentro del mismo package puedo acceder
		System.out.println("Color del Vehiculo: "+miCoche.color);
		
		//Accedo al atributo velocidadPunta que es de tipo protected, como estoy dentro del mismo package puedo acceder
		System.out.println("Velocidad Máxima: " + miCoche.velocidadPunta + " Km/h");
		
		//Aqui no podria acceder al atributo precio directamente, porque es privado.
		//Accedo al precio mediante el metodo getPrecio.
		System.out.println("Precio del Vehiculo: " + miCoche.getPrecio());
		
		System.out.println("--------");
		
		//Ahora podemos acceder a los atributos color y velocidadPunta, porque estamos dentro del mismo package
		//Si estuvieramos fuera del package de las clases, deberiamos hacer uso de sus métodos get y set para 
		//acceder a los atributos. PRUEBA COGER ESTE CODIGO Y METERLO EN OTRO PACKAGE Y VERAS QUE SUCEDE.
		System.out.println("Color del Ford Focus: " + miFocus.color);
		System.out.println("Velocidad Máxima: " + miFocus.velocidadPunta + " Km/h");
		System.out.println("Matricula del Vehiculo: " + miFocus.matricula);
	}
}
