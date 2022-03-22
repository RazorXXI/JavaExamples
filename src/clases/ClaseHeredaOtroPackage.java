//Aunque está ubicada dentro del package clases, esta clase podria heredar sin problema de una clase publica de otro package
package clases;

//Esta permite la herencia aunque estuviera  en otro package, ya que es una clase pública
import clases.ClasePublica;

//Definimos una clase que hereda de ClasePublica
public class ClaseHeredaOtroPackage extends ClasePublica {

	//Aquí vendrian los métodos y atributos

}