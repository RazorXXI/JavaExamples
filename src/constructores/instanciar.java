package constructores;

import java.util.*;
import constructores.coches;

public class instanciar {
	public static void main(String[] args) {

		//Instancia de la clase coches
		//Usando el constructor por defecto
		coches nuevoCoche = new coches();
		
		//Instancia usando uno de los constructores sobrecargado
		coches nissanCoche = new coches("Nissan", "Pulse", 32000);

		//Instancia usando otro constructor sobrecargado
		coches seatCoche = new coches("Seat", "Cordoba");

	}
}