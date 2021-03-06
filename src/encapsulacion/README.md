# Encapsulación

La encapsulación es un mecanismo de la POO, mediante el cual los datos (atributos o variables) y métodos se empaquetan en una sola unidad, ocultando de esta forma los datos, los cuales unicamente podrán ser accedidos mediante los métodos de clase.

Básicamente lo que se hace es ocultar los detalles de la implementación de la clase a los usuarios, dejando unicamente acceso a los métodos de esta para poder operar con ella.

En ejemplos anteriores, hemos visto ya la encapsulación, mediante la declaración y uso de los métodos `get`y `set` los cuales nos permitian leer o escribir en los atributos, los cuales no eran accesibles si no era a traves de estos métodos.

Podemos resumir el encapsulamiento en los siguientes puntos: 
 
 * Es el principio de la POO que permite separar la interfaz de la implementación en una clase.
 * El objetivo de la encapsulación es conseguir **reducir el acoplamiento** entre las clases.
 * La comunicación entre clases solo se realiza a través del **intercambio de mensajes**.
 * Los atributos y operaciones de uso interno, serán definidos como **privados**.
 * Las operaciones consideradas parte de la interfaz de la clase, se definirán como **publicas**.

Podemos ver un ejemplo de como funciona la encapsulación, en las clases [CocheElectrico](CocheElectrico.java), [NissanLeaf](NissanLeaf.java) y [RunCocheElectrico](RunCoche.java).

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

 ### Modificador **Static**
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
 Los elementos `static` son aquellos que **pertenecen a la clase** en vez de al objeto en particular.

 Es por ello que:
  
 - No es necesario instanciar la clase, para poder acceder a ellos.
 - Se comparten entre todas las instancias de una clase.
 
  

 ### Modificador **final**
 * Los atributos declarados como `final` no verán variado su valor durante toda la ejecución del programa.
 * Se emplea principalmente para definir constantes[^2].
 * Tambien lo podemos usar para definir clases como `finales`. Este tipo de clases, no pueden ser heredadas.
 * Su principal uso en clases, es evitar que otras puedan heredar de estas.
 * Tambien se puede emplear en la definición de métodos, para que su definición en clases derivadas sea exactamente la misma que donde fué declarado.

## Uso de Get y Set

Los métodos `get` y `set` son utiles para favorecer el concepto de `encapsulación`, ya que gracias a estos, accederemos a los atributos, bien para conocer su valor o sobreescribirlo, sin tener que acceder directamente a ellos. De este modo, se conserva el concepto de `encapsulamiento`.

Podemos indicar que los tres puntos mas importantes del uso de `get` y `set` son:

 - Favorecer la encapsulación.
 - Permitir crear estructuras más complejas.
 - Favorecer la reutilización del código.

[^1]: Para indicar que un método o atributo tiene el modificador de acceso como *default* simplemente pondremos el mètodo o atributo sin indicar modificador de acceso. Ej: `int numero;`. Este sería un atributo con modificador de acceso *default*
[^2]: Para definir una constante, deberemos indicar que es además `static`. Otro detalle es que las constantes se nombran en mayusculas. Ej: `public static final float VALOR_PI = 3.14159;`