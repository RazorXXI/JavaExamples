package estructurasDeControl;

/**
 * Bucle For each
 * 
 * Definición:
 * 	El bucle for each, es una mejora del bucle for. Este bucle nos permite iterar sobre colecciones de objetos y arrays de manera simple.
 *  En contrapartida, dado que no se referencia por el indice, no podemos acceder a un elemento de la colección indicando su posicion.
 *  
 *  Su sintaxis es:
 *  
 *  	for (Elemento_a_recuperar T: coleccion/array) {
 *  		<BLOQUE_DE_INSTRUCCIONES>
 *  	}
 *  
 * @author juanl
 *
 */

public class bucleForEach {

	public static void main(String[] args) {
		String[] arNombres = {"JUAN", "CARLOS", "MATIAS", "MARTIN", "GERARDO"};

		for (String S: arNombres) {
			System.out.println("Nombre: " + S);
		}
	}
}