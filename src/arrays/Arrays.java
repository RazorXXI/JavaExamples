package arrays;

import clases.Television;

public class Arrays {
	
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
		array2DEnteros = new int[2][3]; //Instanciacion del array de 2 dimensiones 
		
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
		//Otra manera de llamar al metodo toString para mostrar el contenido de un array
		System.out.println(Arrays.toString(arrayCadena));
		
		//Metodo para ver el tamaño de un array
		System.out.println("Tamaño del arrayCadena: " + arrayCadena.length + " elementos");
		System.out.println("Tamaño del array2DEnteros: " + array2DEnteros.length + " filas");
		System.out.println("Tamaño del array2DEnteros: " + array2DEnteros[0].length + " columnas");
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		System.out.println("Tamaño del arrayCadena2: " + arrayCadena2.length + "elementos");
		/**
		 * Explicación del String[] args del método main.
		 * 
		 * Sirve para pasarle algún argumento de entrada al main y poderlo utilizar dentro de el.
		 * 
		 * Si llamamos desde la línea de comandos al método main por ejemplo tal que asi:
		 *     > arrays.main -v -h
		 *     
		 *     -v y -m seran argumentos que utilizaremos dentro de nuestro código
		 *     
		 *     Si hicieramos eso y en nuestro código tuvieramos:
		 *     	System.out.println(args[0]);
		 *     	System.out.println(args[1]);
		 *     
		 *     Estas instrucciones nos mostrarian en la consola :
		 *     -v
		 *     -h
		 *     
		 *     Si queremos hacer la prueba, nos vamos en Eclipse a:
		 *     
		 *     Run -> Run Configurations
		 *     En Run Configurations nos iremos a la pestaña Arguments y ahi dentro, en el cuadro que pone Program Arguments, 
		 *     introduciremos:
		 *     -v -h
		 */
	}

	private static String toString(String[] arrayCadena) {
		String devolucion=null;
		for (String miString : arrayCadena) {
			devolucion = miString + " ";	
		}
		return devolucion;
	}
}