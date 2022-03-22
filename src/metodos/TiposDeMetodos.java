package metodos;

import java.util.*;

import clases.Television;

public class TiposDeMetodos {
/**
 * Manera de definir un método:
 * 
 * 	[modificador_acceso] [tipo_devuelto] nombre_del_metodo(<parametro1> <parametro2>..<parametroN>) {
 * 
 * 		Acciones_a_realizar
 *  }
 *  
 *  Modificadores de acceso:
 *  	- public: Es accesible si es llamado desde un objeto de esta clase.
 *  	- static: Permite llamar a un metodo, sin tener que instanciar la clase (crear un objeto). Normalmente se usa con public o protected.
 *  	- private: NO es accesible, solo se puede acceder a el, desde dentro de la clase.
 *  	- protected: Solo será accesible, desde las clases que compartan paquete.
 */
	
	//Método para multipliar
	public void multiplicar() {
		float num1, num2, producto;
		
		try (//Lo usamos para leer por teclado
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce un numero: ");
			num1 = sc.nextInt();
			
			System.out.println("Introduce numero para multiplicar: ");
			num2 = sc.nextInt();
		}
		
		producto = num1 * num2;
		
		System.out.println("El valor del producto de " + num1 + " * " + num2 + " = " + producto);
	}
	
	//Sobrecarga del metodo multiplicar
	public static float multiplicar(float multiplicador) {
		float num1, producto;
		
		try (//Lo usamos para leer por teclado
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce un numero: ");
			num1 = sc.nextInt();
		}
		
		producto = num1 * multiplicador;
		
		return producto;
	}
	
	//Sobrecarga del metodo multiplicar
	public float multiplicar(float num1, float num2) {
		return num1 * num2;
	}

	//Metodo protegido
	protected void metodoProtegido() {
		System.out.println("Has llamado a un metodo protegido");
		System.out.println("Llamando a un metodo privado");
		metodoPrivado(); //Llamada a un metodo privado de clase
	}
	
	//Metodo privado
	private void metodoPrivado() {
		System.out.println("ESTE ES UN METODO PRIVADO");
	}

	//Metodo que devuelve un objeto
	public Television crearTelevision(String marca, int pulgadas) {
		return new Television(marca, pulgadas); 
	}
	
	public void verTelevision(Television television) {
		System.out.println(television.toString());
	}
}