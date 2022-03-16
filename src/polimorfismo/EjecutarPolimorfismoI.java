package polimorfismo;

public class EjecutarPolimorfismoI {

	public static void main(String[] args) {
		String TipoElectrodomestico = args[0];

		//La variable electro es de la interface Electrodomestico
		//Esta es comun a las clases Lavadora y Tostadora
		Electrodomestico electro = null;
		
		if(TipoElectrodomestico.equals("Lavadora")) {

			//Si el argumento que pasamos al programa es "Lavadora"
			//Instanciamos un objeto de clase Lavadora
			electro = new Lavadora("Balay", 100);
		}
		else if (TipoElectrodomestico.equals("Tostadora")) {

			//Si el argumento que pasamos al programa es "Tostadora"
			//Instanciamos un objeto de clase Tostadora
			electro = new Tostadora("Moulinex", 300);
		}
		else {
			System.out.println("El tipo de electrodomestico no esta contemplado!!");
		}
		
		if (electro != null) {
			//En esta sentencia es donde podemos observar el concepto de polimorfismo
			//dado que el método .isAveriado() es comun a objetos de distinta clase
			System.out.println("Estado de averia: " + electro.isAveriado());
		}
	}

}