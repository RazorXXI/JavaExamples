package clases;

public class ClaseAnidada {
	private String atributo1;
	private String atributo2;
	private ClaseInterna objInterno;
	
	public ClaseAnidada() {		
	}
	
	public ClaseAnidada(String atributo1, String atributo2) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.objInterno = new ClaseInterna();
	}
	
	public String GetAtributo1() {
		return this.atributo1;
	}
	
	public String GetAtributo2() {
		return this.atributo2;
	}
	
	public ClaseInterna GetObjetoInterno() {
		return this.objInterno;
	}
	
	//Esta es la clase Anidada, la ClaseInterna
	class ClaseInterna {
		private String atributoInterno;
		
		public ClaseInterna() {
		}
		public ClaseInterna(String atributoInterno) {
			this.atributoInterno = atributoInterno;
		}
		
		public String GetAtributoInterno() {
			return this.atributoInterno;
		}
		
		//Podemos acceder a los atributos de la clase externa
		public String GetAtributoExterno() {
			return atributo1;
		}
	}
}
