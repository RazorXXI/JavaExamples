package clases;

public class Plaza {
	private int planta;
	private String matricula;
	private boolean ocupado;
	
	public Plaza() {
		super();
	}

	public Plaza(int planta, String matricula) {
		super();
		this.planta = planta;
		this.matricula = matricula;
		this.ocupado = false;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Plaza [planta=" + planta + ", matricula=" + matricula + ", ocupado=" + ocupado + "]";
	}	
}
