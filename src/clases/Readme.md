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
 * final:
 * abstracta:
 * local:
 * anonima:
 * anidada:
