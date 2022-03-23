package clases;

public class ClaseImplementaAbstracta extends ClaseAbstracta {

	public ClaseImplementaAbstracta(String atributo1, String atributo2) {
		//Debemos llamar al constructor de la clase de la que heredamos
		super(atributo1,atributo2);
	}

	//Implementamos el método que heredamos de la clase abstracta
	@Override
	public String MetodoAbstracto() {
		// Aqui implementamos el codigo del metodo
		return null;
	}
}
