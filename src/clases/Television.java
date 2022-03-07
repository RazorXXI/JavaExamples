package clases;

public class Television {

	public String marca;
	public int pulgadas;
	
	public Television(String marca, int pulgadas) {
		super();
		this.marca = marca;
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return "Television [marca=" + marca + ", pulgadas=" + pulgadas + "]";
	}
	
}
