package interfaces;

public class ClaseMoto implements InterfaceVehiculo {
	public String marca;
	public String modelo;
	public String tipo;
	public int velocidad;
	
	public ClaseMoto() {
		this.marca = null;
		this.modelo = null;
		this.tipo = null;
		this.velocidad = 0;
	}
	
	public ClaseMoto(String marca, String modelo, String tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.velocidad = 0;
	}
	
	public ClaseMoto(int velocidad) {
		this.velocidad = velocidad;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public int velocidad() {
		return this.velocidad;
	}

	@Override
	public String tipo() {
		return this.tipo;
	}

}