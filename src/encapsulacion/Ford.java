package encapsulacion;

public class Ford extends Coche {

	public Ford(String color, int precio, int velocidadPunta, String matricula) {
		super(color, precio, velocidadPunta, matricula);
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getVelocidadPunta() {
		return this.velocidadPunta;
	}
}
