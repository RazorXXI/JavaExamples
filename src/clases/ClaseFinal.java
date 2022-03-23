package clases;

public final class ClaseFinal {
	private String atributoString1;
	private String atributoString2;

	//Constructor sin parámetros
	public ClaseFinal() {

	}

	//Constructor con parámetros
	public ClaseFinal(String str1, String str2) {
		super();
		this.atributoString1 = str1;
		this.atributoString2 = str2;
	}

	//Métodos Get y Set
	public String GetAtributoString1() {
		return atributoString1;
	}

	public String GetAtributoString2() {
		return atributoString2;
	}

	public void SetAtributoString1(String str1) {
		this.atributoString1 = str1;
	}

	public void SetAtributoString2(String str2) {
		this.atributoString2 = str2;
	}
}