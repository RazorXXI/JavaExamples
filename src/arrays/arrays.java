import java.util.*;
import clases.Television;

public class arrays {
	
	public static void main(String[] args) {
	
		//Arrays de 1 Dimension
		int[] arrayEnteros; //Forma de declarar un array de numeros enteros.
		String[] arrayCadena;//Forma de declarar un array de strings
		Television[] arrayTelevisions;//Declaración de un array de objetos
		
		//Otra manera de declarar e instanciar un array de strings
		String arrayCadena2[] = {"Una cadena", "Otra cadena", "Otra cadena mas"};
		
		
		//Array de 2 Dimensiones
		int[][] array2DEnteros; //Array de 2 Dimensiones de elementos tipo entero
		
		//Instanaciacion
		arrayEnteros = new int[10]; //Instanciación del array de enteros con 10 elementos. De 0 a 9
		arrayTelevisions = new Television[3];//Instanciación del array de objetos
		arrayCadena = new String[3];//Instanciacion del array de strings
		
		array2DEnteros = new int[3][3]; //Instanciacion del array de 2 dimensiones 
		
		//Asignaciones de arrays
		arrayEnteros[0] = 1;
		arrayEnteros[1] = 23;
		
		arrayTelevisions[0] = new Television("SONY", 55);
		
		arrayCadena[0] = "Cadena 1";
		arrayCadena[1] = "Cadena 2";
		arrayCadena[2] = "Cadena 3";
		
		//Llamamos al metodo ToString del objeto almacenado en la posicion 0 del array
		System.out.println(arrayTelevisions[0]);
		
		//Llamamos al metodo ToString de la posición indicada por [0][1] del array
		System.out.println(array2DEnteros[0][1]);
	}
}