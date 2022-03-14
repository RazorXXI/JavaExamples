# Definición de Clase:
 Una clase es un descriptor para un conjunto de objetos con similar estructura, comportamiento y relaciones.
 
## Sintaxis de declaración de una clase:
 ```
  	[Modificador_de_Acceso] class Nombre_Clase [extends Nombre_Clase_Base][implements Nombre_Interface]{
  
 	}
 ```
 
 * `[Modificador_de_Acceso]`: Es el que va a indicar la visibilidad de una clase.
 * `[extends]`: Es opcional, dado que extends nos va a indicar si la clase que estamos creando, hereda de una clase padre.
 * `[implements]`: Es opcional, e indica que esta clase implementa una "interface".
 
## Tipos de Clases
 Las clases pueden ser de los siguientes tipos:
 
 * publica: 
     - Visible y accesible desde cualquier clase. 
 	 	 - Puede ser Heredada. 
 	 	 - Su sintaxis es "public class Nombre_Clase". 
     - Ver ejemplo: ClasePublica.java

 * package: 
     - Es accesible desde las clases que estan en el mismo package.
     - Solo puede ser heredada desde clases del mismo package.
     - Su sintaxis es "class Nombre_Clase"
     - Ver ejemplo: "ClaseTipoPackage.java"

 * final:
     - Son clases de las que no se puede heredar.
     - Son utiles por motivos de seguridad, ya que no se permite la modificación de las definiciones creadas.
     - Estas si pueden heredar de otras clase, pero no al reves.
     - Mejoran la eficiencia, dado que al no ser herdables, se trabaja por tanto con las instancias de la propia clase.
     - Su sintaxis es "public final class Nombre_Clase".
     - Ver ejemplo: ClaseFinal.java

 * abstracta:
     - Sirven para modelar conceptos tomando como base la herencia. Está pensada para ser la base de otras clases que derivaran de esta.
     - No se pueden instanciar objetos de esta clase.
     - Puede contener como minimo un metodo abstracto. Este debe ser definido o implementado por la clase hija que herede de la clase abstracta.
     - Su sintaxis es: "public abstract class Nombre_Clase".
     - Ver ejemplo: ClaseAbstracta.java

 * local:
     - Es aquella que está declarada dentro de un método de una clase.
     - Puede acceder a las variables del método.
     - No puede acceder a los atributos de la clase externa
     - Ver ejemplo: ClaseLocal.java

 * anonima:
     - Se crea en el momento de la instanciación.
     - Se crea sin nombre.
     - No se puede acceder a los atributos de la clase anónima.
     - Se utilizan para redefinir métodos.
     - Ver ejemplo: ClaseAnonima.java
     
 * anidada: 
     - Es una clase que se encuentra declarada dentro de otra clase.
     - Solo puede instanciarse dentro de la clase externa.
     - Tiene acceso a los atributos de la clase externa.
     - Tambien pueden ser abstractas o finales.
     - Ver ejemplo: ClaseAnidada.java
     - Ver ejemplo: ClaseAnidada.java 
