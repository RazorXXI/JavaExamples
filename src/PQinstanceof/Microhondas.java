package PQinstanceof;

public class Microhondas implements IElectrodomestico {
	public String marca;
	public int consumo;
	public boolean isPuerta;
	public boolean isEmisorMicroH;
	public boolean isMotor;
	
	
	public Microhondas(String marca, int consumo) {
		super();
		this.marca = marca;
		this.consumo = consumo;
		this.isEmisorMicroH = true;
		this.isMotor = true;
		this.isPuerta = true;
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
		return !(this.isEmisorMicroH && this.isMotor && this.isPuerta);
	}

	public boolean isPuerta() {
		return isPuerta;
	}

	public void setPuerta(boolean isPuerta) {
		this.isPuerta = isPuerta;
	}

	public boolean isEmisorMicroH() {
		return isEmisorMicroH;
	}

	public void setEmisorMicroH(boolean isEmisorMicroH) {
		this.isEmisorMicroH = isEmisorMicroH;
	}

	public boolean isMotor() {
		return isMotor;
	}

	public void setMotor(boolean isMotor) {
		this.isMotor = isMotor;
	}
}
