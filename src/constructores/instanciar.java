package constructores;

import java.util.*;
import constructores.Coches;

public class instanciar {
	public static void main(String[] args) {

		//Instancia de la clase coches
		//Usando el constructor por defecto
		Coches nuevoCoche = new Coches();
		
		//Instancia usando uno de los constructores sobrecargado
		Coches nissanCoche = new Coches("Nissan", "Pulse", 32000);

		//Instancia usando otro constructor sobrecargado
		Coches seatCoche = new Coches("Seat", "Cordoba");

	}
}