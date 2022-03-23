package lectura;

import java.io.*;
import java.util.*;

public class lecturaTeclado {

	private String nombreString;
	private int edad;
	
	public lecturaTeclado() {
		this.nombreString = "";
		this.edad = 0;
	}
	
	public void lecturaBufferedReader() throws IOException {
		BufferedReader rdLectura = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Dime como te llamas: ");
		nombreString = rdLectura.readLine();
		System.out.println("Hola, como estas " + nombreString);
	}
	
	public void lecturaScannerString() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Te voy a cambiar el nombre: " + nombreString);
			System.out.print("Dime un nuevo nombre: ");
			nombreString = sc.nextLine();
		}
		
		System.out.println("Ahora te llamas " + nombreString);

	}
	
	public void leerEdad() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Indique su edad: ");
			edad = sc.nextInt();
		}
	}

	public String getNombreString() {
		return nombreString;
	}

	public void setNombreString(String nombreString) {
		this.nombreString = nombreString;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		String atributoString;
		
		atributoString = "Nombre:" + nombreString + "\n" + "Edad:" + edad;
		return atributoString;
	}	
}