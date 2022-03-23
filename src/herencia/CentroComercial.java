package herencia;

import java.util.*;

public class CentroComercial {
	
	private List<Cliente> clientes = new ArrayList<>();
	private List<Tienda> tiendas = new ArrayList<>();
	
	public CentroComercial() {
		super();
	}
	
	public void entraCliente (Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void saleCliente(Cliente cliente) {
		clientes.remove(cliente);
	}
	
	//Ejemplo de relación de Composición
	//Si destruimos el objeto CentroComercial, destruimos tambien tienda.
	public void construirTienda() {
		tiendas.add(new Tienda("Zapateria",1,200));
	}
}