package herencia;

public class FordScort extends Ford {
	private int potencia;
	
	public FordScort(int depositoLitros, int velocidad, String color, String motor, boolean abs, int potencia) {
		super(depositoLitros, velocidad, color, motor, abs);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}