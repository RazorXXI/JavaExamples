package herencia;

public class RunConversion {

	public static void main(String[] args) {
		
		//Creamos dos objetos de tipo Coche, pero si vemos, son distintos.
		//Uno es de clase coche y el otro de clase Ford, esta ultima, hereda de Coche
		Coche coche = new Coche(60,0,"Rojo");
		Coche ford = new Ford(70,0,"Blanco","Gasolina",false);
		
		//Conversion Implicita
		coche = ford;

		//Ejemplo de Conversion Explicita
		int numeroEntero = 4;
		float numeroDecimal = 3.14f;
		
		//Conversion Explicita mediante Casting
		numeroEntero = (int) numeroDecimal;
	}
}