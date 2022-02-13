import java.util.*;

public class EjemplosDeListas {

	public static void main(String[] args) {
		//Declaración e Instanciación de listas
		List<String> listaDeNombres = new ArrayList<>();
		
		//Guardar elementos
		listaDeNombres.add("JUAN");
		String nombre = "LUIS";
		listaDeNombres.add(nombre);
		
		//Recuperar elementos
		System.out.println(listaDeNombres.get(0));
		System.out.println(listaDeNombres.get(1));
		
		//Conocer tamaño de la lista
		System.out.println("El tamaño de la lista es de: " + listaDeNombres.size() + " Elemento/s");
		
		//Eliminar elementos
		listaDeNombres.remove(0);
		//Los indices se reajustan automaticamente al eliminar un elemento
		System.out.println(listaDeNombres.get(0));
		
		//Transformar en Array
		System.out.println("El tamaño de la lista es: " + listaDeNombres.size());
		String[] arrayDeNombres = new String[listaDeNombres.size()];
		
		

	}

}