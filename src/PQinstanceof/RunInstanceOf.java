package PQinstanceof;

import java.util.Scanner;

public class RunInstanceOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tipoElectrodomestico;
		int contador = 0;
		IElectrodomestico[] electrodomestico = new IElectrodomestico[4];
		
		do {
			System.out.println("Introduzca Tipo de Electrodomestico: ");
			tipoElectrodomestico = sc.nextLine();

			if (tipoElectrodomestico.equals("Lavadora")) {
				electrodomestico[contador] = new Lavadora(700,"Balay");
			}
			else if (tipoElectrodomestico.equals("Microhondas")) {
				electrodomestico[contador] = new Microhondas("Fagor", 1000);
			}
			else System.out.println("Electrodomestico No Valido");
			
			contador++;
			
		} while (contador<4);
		
		for (IElectrodomestico item : electrodomestico) {
			if (item instanceof Lavadora) {
				System.out.println("Lavadora averiada? " + item.isAveria());
			}else if(item instanceof Microhondas) {
				System.out.println("Microhondas averiado? " + item.isAveria());
			}else System.out.println("Electrodomestico no valido");
		}
	}
}
