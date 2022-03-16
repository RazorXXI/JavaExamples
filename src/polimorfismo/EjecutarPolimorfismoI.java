package polimorfismo;

/**
 * Descripcion: Código para probar el concepto de polimorfismo de inclusion.
 * 
 * Variables:
 * 	tipoElectrodomestico - Variable de tipo String que recibe el argumento pasado al programa
 *  electro - Variable de tipo interface la cual se empleará para instanciar objetos de tipo Lavadora o Tostadora
 * 
 * Métodos:
 * 	.isAveriado - Método de la interfaz que implementan las clases Lavadora y Tostadora
 * */
public class EjecutarPolimorfismoI {

	public static void main(String[] args) {
		String tipoElectrodomestico = args[0];

		Electrodomestico electro = null;
		
		if(tipoElectrodomestico.equals("Lavadora")) {
			electro = new Lavadora("Balay", 100);
		}
		else if (tipoElectrodomestico.equals("Tostadora")) {
			electro = new Tostadora("Moulinex", 300);
		}
		else {
			System.out.println("El tipo de electrodomestico no esta contemplado!!");
		}
		
		if (electro != null) {
			System.out.println("Estado de averia: " + electro.isAveriado());
		}
	}
}