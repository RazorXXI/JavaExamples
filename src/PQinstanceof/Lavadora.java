package PQinstanceof;

public class Lavadora implements IElectrodomestico {
	private int consumo;
	private String marca;
	private boolean isTambor;
	private boolean isPuerta;
	private boolean isMotor;
	private boolean isBombaAgua;
	
	
	
	public Lavadora(int consumo, String marca) {
		super();
		this.consumo = consumo;
		this.marca = marca;
		this.isBombaAgua = true;
		this.isMotor = true;
		this.isPuerta = true;
		this.isTambor = true;
	}

	@Override
	public int getConsumo() {
		return this.consumo;
	}

	@Override
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	@Override
	public String getMarca() {
		return this.marca;
	}

	@Override
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public boolean isAveria() {
		return !(this.isBombaAgua && this.isMotor && this.isPuerta && this.isTambor);
	}

	public boolean isTambor() {
		return isTambor;
	}

	public void setTambor(boolean isTambor) {
		this.isTambor = isTambor;
	}

	public boolean isPuerta() {
		return isPuerta;
	}

	public void setPuerta(boolean isPuerta) {
		this.isPuerta = isPuerta;
	}

	public boolean isMotor() {
		return isMotor;
	}

	public void setMotor(boolean isMotor) {
		this.isMotor = isMotor;
	}

	public boolean isBombaAgua() {
		return isBombaAgua;
	}

	public void setBombaAgua(boolean isBombaAgua) {
		this.isBombaAgua = isBombaAgua;
	}
}
