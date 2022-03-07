/**
 * Bucle While
 * 
 * Definición:
 * 	El bucle While es una estructura de control, que permite repetir un bloque de código indefinidamente mientras se cumpla una condición
 *  la cual es evaluada previamente.
 *  De esta definición, se pueden extraer dos consideraciones:
 *  	1 - El bucle se puede ejecutar al N veces si la condición evaluada se cumple.
 *  	2 - El bucle nunca se ejecutara si la condición a evaluar no es cierta.
 *  
 *  Su sintaxis es:
 *  	while (condicion_a_evaluar) {
 *  		<Instrucciones_a_ejecutar>
 *  	}
 *  
 *  Una cosa importante a tener en cuenta, es que una vez dentro del while, deberemos de hacer que al menos en algun instante, la condición
 *  se cumpla, dado que de lo contrario entraremos en un bucle infinito, el cual nos dejará colgada la ejecución dentro del bucle de manera
 *  perpetua, o hasta que reiniciemos nuestro ordenador
 *  
 * @author juanl
 *
 */
public class bucleWhile {

	public static void main(String[] args) {
	
		int limite = 20;
		int contador = 0;
	
		while(contador < limite) {
			System.out.println("Valor Contador: " + (contador+1));
			contador++; //Esto es lo mismo que hacer contador = contador + 1
			//Vamos incrementando contador en cada vuelta del bucle para llegar a obtener la condicion de salida.
		}
	}
}