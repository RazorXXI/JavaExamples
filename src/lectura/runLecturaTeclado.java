package lectura;

import java.io.IOException;

public class runLecturaTeclado {

	public static void main(String[] args) throws IOException {
		
		lecturaTeclado objLecturaTeclado = new lecturaTeclado();
		
		objLecturaTeclado.lecturaBufferedReader();
		objLecturaTeclado.lecturaScannerString();//Lectura de cadena de texto
		
		objLecturaTeclado.leerEdad();
		System.out.println(objLecturaTeclado);
	}
}