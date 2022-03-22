package estructurasDeControl;

/**
 * La Estructura de control IF.
 * 
 * Esta estructura sirve para dirigir el flujo de programa en función a la evaluación de su condición, permitiendo asi ejecutar las
 * instrucciones, en funcion de si se cumple o no la condicion.
 * 
 * La forma mas simple que tiene esta estructura es:
 * 
 * 		if (condicion_booleana) {
 * 			<INSTRUCCIONES>
 *		}
 *		else {
 *			<OTRAS_INSTRUCCIONES>
 *		}
 *
 * Otra forma que podemos encontrar es:
 * 
 * 		if (condicion_booleana_1) {
 * 			<BLOQUE INSTRUCCIONES 1>
 *		}
 *		else if (condicion_booleana_2) {
 *			<BLOQUE INSTRUCCIONES 2>
 *		}
 *		else if (condicion_booleana_N) {
 *			<BLOQUE INSTRUCCIONES N>
 *		}
 *		else {
 *			<BLOQUE INSTRUCCIONES CUANDO NO SE CUMPLE TODAS LAS DEMAS>
 *		}
 * @author juanl
 *
 */

public class estructuraIf {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		}
		else if (num1 < num2) {
			System.out.println(num2 + " es mayor que " + num1);
		}
		else {
			System.out.println(num1 +  " y " + num2 + " son iguales");
		}
	}
}