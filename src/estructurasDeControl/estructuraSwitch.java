import java.util.*;
/**
 * Estructura de control Switch
 * 
 * Esta estructura nos permite elegir las acciones a ejecutar en relación al valor de sus casos, los cuales toma de la variable a evaluar
 * 
 * Su forma es la siguiente:
 * 
 * 	switch(variable_a_evaluar)
 * 	{
 * 		case valor_1: //Valor que toma la variable a evaluar
 * 					  //Aqui vendria el codigo y acciones a realizar
 * 					  break; //Es opcional y detiene la ejecucion del switch si se ha cumplido la condicion.
 *		case valor_2:
 *					//Acciones a realizar
 *					break;
 *		case valor_N:
 *					//Acciones a realizar
 *					break;
 *		default:	//Acciones que realizará por defecto en caso de que no se haya cumplido ninguna de las anteriores condiciones.
 *					break;
 * 	}
 * @author juanl
 *
 */

public class estructuraSwitch {

	public static void main(String[] args) {
		int dia;
		String nombreDia;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un valor para el dia de la semana <1..7>: ");
		dia = sc.nextInt();
		
		switch(dia)
		{
		case 1:
				System.out.println("Lunes");
				break;
		case 2:
				System.out.println("Martes");
				break;
		case 3:
				System.out.println("Miercoles");
				break;
		case 4:
				System.out.println("Jueves");
				break;
		case 5:
				System.out.println("Viernes");
				break;
		case 6:
				System.out.println("Sabado");
				break;
		case 7:
				System.out.println("Domingo");
				break;
		default:
			System.out.println("El dia introducido no es un dia valido");
			break;
		}
	}
}
