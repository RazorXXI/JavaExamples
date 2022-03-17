package polimorfismo;

import java.util.Scanner;

public class EjecutarPolimorfismoII {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String tipoElectrodomestico;
		Electrodomestico[] electro = new Electrodomestico[4];
		String marca;
		int potencia;
		
		for (int i = 0; i < electro.length; i++) {
			System.out.println("Introduzca Tipo (Lavadora/Tostadora): ");
			tipoElectrodomestico = sc.next();
			
			System.out.println("Indique marca: ");
			marca = sc.next();
			System.out.println("Indique potencia: ");
			potencia = sc.nextInt();
			
			if(tipoElectrodomestico.equals("Lavadora")) {	
				electro[i] = new Lavadora(marca,potencia);
			}
			else if(tipoElectrodomestico.equals("Tostadora")) {
				electro[i] = new Tostadora(marca,potencia);
			}
			else System.out.println("Datos no cargados: El electrodomestico indicado no esta contemplado!!");
		}
	}
}
