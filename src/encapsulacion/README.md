# Encapsulamiento

# Modificadores de acceso

Los modificadores de acceso se dividen en 4 niveles y en el siguiente cuadro vemos cual es su nivel de accesibilidad:

|**Modificador** | **Clase** | **Paquete** | **Subclase** | **Todos** |
|:---|:---|:---|:---|:---|
| **public** | SI | SI | SI | SI |
| **protected** | SI | SI | SI | NO |
| **default**[^1] | SI | SI | NO | NO |
| **private** | SI | NO | NO | NO |

Podemos ver esto mejor, si observamos los ejemplos de las clases [Coche](Coche.java), [Ford](Ford.java) y [RunCoche](RunCoche.java)

## Modificadores *final* y *static*

Los modificadores *final* y *static*, son lo que se conocen con el nombre de **Modificadores de No Acceso**. Estos se usan con las clases, métodos, atributos y constructores.

 * **Static**
 	 * Si se declara una variable como `Static` estamos haciendo lo que se conoce como una variable global. Al declarar un objeto, no se realizará una copia de una variable estatica. Por el contrario, todas las instancias de la clase, compartiran la misma variable estatica.
  	 * No es necesario instanciar un objeto, para acceder a una variable estatica, simplemente accederemos mediante su clase.

 ```Java
  public class MiClase {
  	static int num;

  	public MiClase() {
  		num=0;
  	}
  }

  public class EjemploStatic {

  	public static void main(String[] args) {
  		MiClase objeto1 = new MiClase();
  		MiClase objeto2 = new MiClase();

  		MiClase.num = 10;

  		System.out.println("Valor Num en Objeto1: " + objeto1.num);
  		System.out.println("Valor Num en Objeto2: " + objeto2.num);
  	}
  }
 ```
 
 * **final**
 	 * Los atributos declarados como `final` no verán variado su valor durante toda la ejecución del programa.
 	 * Se emplea principalmente para definir constantes[^2].
 	 * Tambien lo podemos usar para definir clases como `finales`. Este tipo de clases, no pueden ser heredadas.
 	 * Su principal uso en clases, es evitar que otras puedan heredar de estas.
 	 * Tambien se puede emplear en la definición de métodos, para que su definición en clases derivadas sea exactamente la misma que donde fué declarado.


[^1]: Para indicar que un método o atributo tiene el modificador de acceso como *default* simplemente pondremos el mètodo o atributo sin indicar modificador de acceso. Ej: int numero; Este sería un atributo con modificador de acceso *default*
[^2]: Para definir una constatnte, deberemos indicar que es ademas static. Otro detalle es que las constantes se nombran en mayusculas. Ej: public static final float VALOR_PI = 3.14159f;