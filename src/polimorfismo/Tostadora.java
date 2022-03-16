package polimorfismo;

public class Tostadora implements Electrodomestico {
	private String marca;
	private int consumo;
	private boolean isResistencia;
	private boolean isRanuraTostadas;
	private boolean isTemporizador;
	private boolean isTermostato;
	
	public Tostadora() {
		super();
		this.marca = null;
		this.consumo = 0;
		this.isResistencia = true;
		this.isRanuraTostadas = true;
		this.isTemporizador = true;
		this.isTermostato = true;
	}
	public Tostadora(String marca, int consumo) {
		super();
		this.marca = marca;
		this.consumo = consumo;
		this.isResistencia = true;
		this.isRanuraTostadas = true;
		this.isTemporizador = true;
		this.isTermostato = true;
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
		
		return !(isRanuraTostadas && isResistencia && isTemporizador && isTermostato);
	}
	public boolean isResistencia() {
		return isResistencia;
	}
	public void setResistencia(boolean isResistencia) {
		this.isResistencia = isResistencia;
	}
	public boolean isRanuraTostadas() {
		return isRanuraTostadas;
	}
	public void setRanuraTostadas(boolean isRanuraTostadas) {
		this.isRanuraTostadas = isRanuraTostadas;
	}
	public boolean isTemporizador() {
		return isTemporizador;
	}
	public void setTemporizador(boolean isTemporizador) {
		this.isTemporizador = isTemporizador;
	}
	public boolean isTermostato() {
		return isTermostato;
	}
	public void setTermostato(boolean isTermostato) {
		this.isTermostato = isTermostato;
	}
}
