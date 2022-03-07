/**
 * Excepciones en Java
 * 
 * Definición:
 * 	Una excepción, es un error ocurrido en tiempo de ejecución. Java nos ofrece mecanismos para controlar este tipo de errores, sin que 
 *  nuestro programa sufra una rotura.
 *  
 *  Para controlar las excepciones, se define un bloque de codigo el cual se conoce como MANEJADOR DE EXCEPCIONES, el cual se ejecuta 
 *  automaticamente cuando se produce un error.
 *  
 *  En Java, todas las excepciones derivan de una clase llamada Throwable. De esta, se derivan dos subclases:
 *  	- Exception: Son errores que se producen por una actividad derivada de nuestro programa, como por ejemplo, una division por cero,
 *  	  acceder a un array fuera de su rango, error en la apertura de un archivo, etc.
 *  	- Error: Son errores propiamente generados directamente por la Maquina Virtual de Java, y por tanto estan fuera del control de 
 *  	  nuestro programa, con lo cual no las podremos manejar, ya que son ajenas a nuestro control
 *  
 *  Para el manejo de excepciones utilizaremos el bloque de instrucciones Try-Catch, cuya sintaxis es:
 *  
 *  	try {
 *  		//Bloque de codigo donde vamos a controlar las excepciones
 *  	}
 *  	catch (TipoExcepcion1 exc1) {
 *  		//Bloque de instrucciones a ejecutar si se produce TipoExcepcion1
 *  	}
 *  	catch (TipoExcepcion2 exc2) {
 *  		//Bloque de instrucciones a ejecutar si se produce TipoExcepcion2
 *  	}
 *  
 *  Si no se lanza ninguna de las excepciones contempladas por los diferentes catch, el bloque try finalizara normalmente.
 *  
 *  La lista de excepciones de Java es enorme, con lo cual no las vamos a nombrar a todas, solamente veremos algunas de las mas comunes.
 *  En caso que quieras ver todo el listado completo de excepciones de Java, te recomiendo que visites el API de Java.
 *  
 *  
 *  
 * @author juanl
 * @see <a href="https://i.stack.imgur.com/81asr.gif">Listado de Excepciones de Java</a>
 *
 */

public class manejoExcepciones {
	
	static void metodoExcepcion() {
		int[] arPruebas = new int[5];
		
		System.out.println("Este metodo genera una excepcion");
		arPruebas[8] = 19;
	}
	
	public static void main(String[] args) {
		
		//Declaracion de un array de 7 elementos
		int[] arNumeros = new int[6]; 
		
		//Vamos a forzar una excepcion
		try {
//			System.out.println("Vamos a lanzar una excepcion...!");
//			arNumeros[7] = 14; //Vamos a acceder a una posicion que no existe
			metodoExcepcion();
			
		}
		//ArrayIndexOutOfBoundsException es una excepcion de JAVA para indicar que estamos accediendo a un elemento fuera del
		//rango del array
		catch(ArrayIndexOutOfBoundsException arExc) {
			System.out.println("Has accedido a un limite fuera de rango!!");
		}
		System.out.println("Ya estamos fuera del Try...");
	}
}