package polimorfismo;

public class Lavadora implements Electrodomestico {
	private String marca;
	private int consumo;
	private boolean isTambor;
	private boolean isMotor;
	private boolean isBombaAgua;
	private boolean isFiltro;
	private boolean isTomaAgua;
	
	public Lavadora() {
		super();
		this.marca = null;
		this.consumo = 0;
		this.isTambor = true;
		this.isMotor = true;
		this.isBombaAgua = true;
		this.isFiltro = true;
		this.isTomaAgua = true;
	}
	public Lavadora(String marca, int consumo) {
		super();
		this.marca = marca;
		this.consumo = consumo;
		this.isTambor = true;
		this.isMotor = true;
		this.isBombaAgua = true;
		this.isFiltro = true;
		this.isTomaAgua = true;
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
	public boolean isAveriado() {
		if(!this.isBombaAgua || !this.isFiltro || !this.isMotor || !this.isTambor || !this.isTomaAgua) return true;
		else return false;
	}
	public boolean isTambor() {
		return isTambor;
	}
	public void setTambor(boolean isTambor) {
		this.isTambor = isTambor;
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
	public boolean isFiltro() {
		return isFiltro;
	}
	public void setFiltro(boolean isFiltro) {
		this.isFiltro = isFiltro;
	}
	public boolean isTomaAgua() {
		return isTomaAgua;
	}
	public void setTomaAgua(boolean isTomaAgua) {
		this.isTomaAgua = isTomaAgua;
	}
}
