package clases;

public class ClaseAnonima {

	private String atributo1;
	private ClasePublica objClasePublica;
	
	public ClaseAnonima() {
		this.atributo1 = "";
		
		//Esta es la clase anonima
		//Y esta redefiniendo un metodo de ClasePublica
		objClasePublica = new ClasePublica() {
			
			public String GetAtributoString1() {
				return "Esta es la Clase Anonima";
			}
		};
	}
	
	public String GetMensajeClaseAnonima() {
		return this.objClasePublica.GetAtributoString1();
	}
}