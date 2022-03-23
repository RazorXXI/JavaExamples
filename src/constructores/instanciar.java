package constructores;

public class Instanciar {
	public static void main(String[] args) {

		//Instancia de la clase coches
		//Usando el constructor por defecto
		Coches nuevoCoche = new Coches();
		
		//Instancia usando uno de los constructores sobrecargado
		Coches nissanCoche = new Coches("Nissan", "Pulse", 32000);

		//Instancia usando otro constructor sobrecargado
		Coches seatCoche = new Coches("Seat", "Cordoba");

		System.out.println(nuevoCoche);
		System.out.println(nissanCoche);
		System.out.println(seatCoche);

	}
}