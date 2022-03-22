package funcionesCadena;

public class funcionesString {
	public static void main(String[] args) {
		
		String cadenaVacia = null; //Declaracion de una cadena vacia
		String cadena1 = "ESTO ES UNA CADENA"; //Asignacion de una cadena
		
		//Otra forma de declarar una cadena
		String cadena2 = new String("Esto es otra cadena");
		
		System.out.println("Cadena Vacia: " + cadenaVacia);
		System.out.println("Cadena 1: " + cadena1);
		System.out.println("Cadena 2: " + cadena2);
		
		//Comprobacion de si una cadena esta vacia o no
		if(cadenaVacia != null)
			System.out.println("La cadena esta NO ESTA VACIA");
		else System.out.println("La cadena ESTA VACIA");

		
		//Otra manera de comprobar si una cadena esta vacia o no
		if(cadena1.isEmpty())
			System.out.println("La cadena2 esta VACIA");
		else {
			System.out.println("La cadena2 NO esta VACIA");
		}
		
		//Para saber la longitud de una cadena
		System.out.println("La longitud de CADENA2 es: " + cadena2.length());
		
		//Para devolver un valor en una posicion de una cadena
		System.out.println("El elemento en la posicion 3 de CADENA1 es: " + cadena1.charAt(2));
		
		//Conversion de una cadena a minusculas
		System.out.println("Conversion a minusculas: " + cadena1.toLowerCase());
		
		//Conversion de una cadena a mayusculas
		System.out.println("Conversion a mayusculas: " + cadena2.toUpperCase());
		
		//Reemplazando caracteres en una cadena
		System.out.println("Reemplazando E por O: " + cadena1.replace("E", "O"));
		
		//Comparar cadenas
		if(cadena1.compareTo(cadena2)==0) System.out.println("Ambas cadenas son Iguales");
		else System.out.println("Las cadenas son distintas");
		
		//Otra forma de comparar cadenas
		if(cadena1.equals(cadena2)) System.out.println("Las cadenas son iguales");
		else System.out.println("Las cadenas son DISTINTAS");
	}
}