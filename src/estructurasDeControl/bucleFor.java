/**
 * Bucle For
 * 
 * Definición:
 * 	El bucle for, es un tipo de bucle, donde previamente se define el numero de iteraciones de este, ya que tiene un valor de inicializacion
 *  una condicion de limite previamente definida y un incremento.
 *  Este tipo de bucles es muy usado para recorrer arrays.
 *  
 *  Su sintaxis es:
 *  
 *  	for(valor_inicializacion; condicion; incremento) {
 *  		<BLOQUE_DE_INSTRUCCIONES>
 *  	}
 * @author juanl
 *
 */

public class bucleFor {

	public static void main(String[] args) {
		
		String[] arNombres = {"JUAN", "CARLOS", "MATIAS", "MARTIN", "GERARDO"};
		int size;
		
		size = arNombres.length;
		
		for(int i=0; i<size; i++) {
			System.out.println("Nombre: " + arNombres[i]);
		}
	}
}
