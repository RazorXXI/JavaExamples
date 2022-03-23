package herencia;

public class Tienda {
	private String nombreTienda;
	private int planta;
	private int superficie;
	
	public Tienda(String nombreTienda, int planta, int superficie) {
		super();
		this.nombreTienda = nombreTienda;
		this.planta = planta;
		this.superficie = superficie;
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
}