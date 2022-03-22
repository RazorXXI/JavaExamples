package metodos;

import clases.Television;

public class runMetodos {

	public static void main(String[] args) {

		TiposDeMetodos varMetodo = new TiposDeMetodos();
		Television miTelevision;
		
		//Accediendo al metodo estatico
		//Aqui solo debemos llamar al metodo desde la clase
		System.out.println("El valor del producto es: " + TiposDeMetodos.multiplicar(4f));
		
		varMetodo.multiplicar();
		miTelevision = varMetodo.crearTelevision("Sony", 55);
		varMetodo.verTelevision(miTelevision);
		
		//Otra manera de llamar al metodo verTelevision
		varMetodo.verTelevision(new Television("SAMSUNG", 36));
	}
}