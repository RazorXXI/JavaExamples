import java.util.*;
import clases.Television;
/**
 * Descripcion: Ejemplo de usos de MAPAS
 * 
 * Para declarar un mapa, se hará uso de su interfaz MAP<K,V> donde K va a representar la clave, la cual es unica y V el valor almacenado
 * 
 * Para instanciar un mapa, haremos uso de las implementaciones HashMap() o TreeMap().
 * - HashMap(): No guarda los datos de manera ordenada según los vamos introduciendo
 * - TreeMap(): Guarda los datos en el orden que los vamos introduciendo.
 * 
 * La forma de declarar un Mapa es:
 * 
 * 	Map<TipoDatoClave, TipoDatoValor> identificador = new HashMap/TreeMap();
 * 
 * @author juanl
 *
 */
public class ejemploMapas {

	public static void main(String[] args) {
		
		//Forma de declarar e instanciar un mapa
		//para este hacemos uso de la implementacion HashMap
		Map<String, String> mpUsuarios = new HashMap<>();
		Map<String, Television> mpCatalogoTelevision = new HashMap<>();
		
		//Almacenando Informacion
		mpUsuarios.put("01A32B", "PABLO CALVO");
		mpUsuarios.put("02BD345", "JAVIER RODRIGUEZ");
		
		mpCatalogoTelevision.put("LINEA ECONOMICA", new Television("ELBE", 14));
		mpCatalogoTelevision.put("GAMA MEDIA", new Television("PHILLIPS", 32));
		mpCatalogoTelevision.put("GAMA ALTA", new Television("SAMSUNG 4K UHD", 72));
		
		//Recuperando informacion
		System.out.println(mpUsuarios.get("01A32B"));
		System.out.println(mpCatalogoTelevision.get("LINEA ECONOMICA"));
		
		//Conocer el tamaño de un mapa
		System.out.println("El catalogo de televisiores tiene: " + mpCatalogoTelevision.size() + " elementos");
		
		//Eliminando elementos
		String nombreUsuario = mpUsuarios.remove("01A32B");
		if (nombreUsuario!=null) {
			System.out.println("Se ha eliminado el usuario " + nombreUsuario);
		}
		else {
			System.out.println("No ha sido eliminado ningun elemento...");
		}
		
		//Reemplazando Valores
		System.out.println("Usuario a cambiar: " + mpUsuarios.get("02BD345"));
		mpUsuarios.replace("02BD345", "JAVIER ROMERO");
		System.out.println("Nuevo Nombre Usuario: " + mpUsuarios.get("02BD345"));
	}

}