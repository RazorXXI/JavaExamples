package clases;

public abstract class ClaseAbstracta {
	private String atributoString1;
	private String atributoString2;

	//Constructor sin parámetros
	public ClaseAbstracta() {

	}

	//Constructor con parámetros
	public ClaseAbstracta(String str1, String str2) {
		super();
		this.atributoString1 = str1;
		this.atributoString2 = str2;
	}

	//Declaración de un método abstracto
	public abstract String MetodoAbstracto();

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