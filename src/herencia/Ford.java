package herencia;

public class Ford extends Coche {

	private String motor;
	private boolean abs;
	
	public Ford(int depositoLitros, int velocidad, String color, String motor, boolean abs) {
		super(depositoLitros, velocidad, color);//El constructor de la superclase Coche
		this.motor = motor;
		this.abs = abs;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}
}