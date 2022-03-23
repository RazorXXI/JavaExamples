package estructurasDeControl;

/**
 * Bucle Do-While
 * 
 * Definicion:
 * 	Al igual que el Bucle While, el bucle do-while es un bucle en el cual se repite un bloque de instrucciones, mientras se cumpla una
 *  condición que es evaluada.
 *  A diferencia del bucle while, que se evalua la condición al principio del bucle, en el do-while, se evalua al final, por lo que en este
 *  caso el bucle se ejecutará al menos 1 vez, a diferencia del while, que si la condición inicial no se cumplía, no se entraba en el.
 *  
 *  Su sintaxis es:
 *  
 *  do {
 *  	<BLOQUE_DE_INSTRUCCIONES>
 *  }while(condicion_a_evaluar);
 * @author juanl
 *
 */

public class bucleDoWhile{

	public static void main(String[] args) {
	
		int limite=10;
		int contador=10;
		
		do {
			System.out.println("Valor del Contador: " + contador);
			contador++;
		}while(contador<limite); //Entra en el bucle, aunque el valor de contador sea igual al del limite
		//Cuando evalua la condición se termina el bucle, pero ha entrado al menos una vez
		
		System.out.println("He salido del bucle do-while");
	}
}