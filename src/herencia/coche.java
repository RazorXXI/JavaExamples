package herencia;

public class Coche {
	private int depositoLitros;
	private int velocidad;
	private String color;
	
	public Coche(int depositoLitros, int velocidad, String color) {
		super();
		this.depositoLitros = depositoLitros;
		this.velocidad = velocidad;
		this.color = color; 
	}
	
	public void frenar() {
		this.velocidad--;
	}
	
	public void acelerar() {
		this.velocidad++;
	}

	public int getDepositoLitros() {
		return depositoLitros;
	}

	public void setDepositoLitros(int depositoLitros) {
		this.depositoLitros = depositoLitros;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}