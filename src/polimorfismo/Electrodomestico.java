package polimorfismo;

public interface Electrodomestico {
	public int getConsumo();
	public void setConsumo(int consumo);
	public String getMarca();
	public void setMarca(String marca);
	public boolean isAveriado();
}