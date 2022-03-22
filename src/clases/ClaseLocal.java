package clases;

public class ClaseLocal {
	private String atributo1;
	private String atributo2;
	
	public ClaseLocal() {
	}
	
	public String getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

	public ClaseLocal(String atr1, String atr2) {
		this.setAtributo1(atr1);
		this.atributo2 = atr2;
	}
	
	public String GetAtributoLocalInterno() {

		//Esta seria la clase local
		class ClaseLocalMetodo {
			private String atributoInternoLocal;
			
			public ClaseLocalMetodo() {
				super();
			}
			
			public ClaseLocalMetodo(String atr1) {
				super();
				this.atributoInternoLocal = atr1;
			}
			
			public String GetAtributoInternoMetodo() {
				return this.atributoInternoLocal;
			}
			
			public void SetAtributoInternoMetodo(String atr) {
				this.atributoInternoLocal = atr;
			}
		}
		
		ClaseLocalMetodo objLocalMetodo = new ClaseLocalMetodo("AtributoLocal");
		ClaseLocalMetodo objLocalMetodo2 = new ClaseLocalMetodo();

		objLocalMetodo2.SetAtributoInternoMetodo("Atributo");
		
		return objLocalMetodo.GetAtributoInternoMetodo();
	}
	
	public String GetAtributo2() {
		return this.atributo2;
	}
}