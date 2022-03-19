package herencia;

public class FordScort extends Ford {
	private int potencia;
	private String matricula
	
	public FordScort(int depositoLitros, int velocidad, String color, String motor, boolean abs, String matricula, int potencia) {
		super(depositoLitros, velocidad, color, motor, abs);
		this.potencia = potencia;
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}