# Operador **this**

La definición formal nos dice que el operador `this`:

 - Constituye una referencia sobre el objeto que se está ejecutando en un momento dado.
 - Invoca a otro constructor que esté en la misma clase y que soporte el conjunto de parámetros que le pasemos.

 Seguramente visto así resulta un poco lioso.

 Ya hemos visto en ejemplos anteriores el uso de `this`, el cual lo llamabamos dentro de un constructor para referirnos a los atributos de una clase. Esto se usa normalmente para evitar confusión con los parámetros que pasemos que tengan el mismo nombre. Ya que si tanto los parámetros como los atributos tienen el mismo nombre y no usaramos `this`, tendriamos un problema ya que el compilador no sabria dedicir a que nos estamos refiriendo.

 Un ejemplo de esto:

 ```Java
 public class Clase {
     private int a;
     private int b;

     public Clase(int a, int b) {
         //Usamos this.a para referirnos al altributo int a
         this.a = a;
         //Usamos this.b para referirnos al atributo int b
         this.b = b;
     }
 }
 ```

 Si vemos en el ejemplo, tanto atributos como los parámetros del constructor se llaman igual, si no usaramos `this` el compilador de Java no sabria si nos estamos refiriendo a los parámetros o a los atributos.

 Te invito a que hagas la prueba del ejemplo quitando `this` y dejando `a=a;` veras que te indica tu IDE al respecto... 😜

Del mismo modo, podemos usar `this` para llamar a otro constructor dentro de la misma clase, el cual tenga una serie de parámetros. Vamos con un ejemplo:

```Java
public class Clase {
    private int a;
    private int b;

    public Clase() {
        System.out.println("Ejecutando Constructor sin parámetros");
        //Aqui estamos llamando al consstructor con parametros
        this(10, 20);
    }

    public Clase(int a, int b) {
        System.out.println("Ejecutando Constructor con parámetros");
        this.a = a;
        this.b = b;
    }
}
```

Si observamos el ejemplo, veremos como dentro del constructor sin parámetros hacemos uso del operador `this` para llamar al constructor con parámetros que tenemos un poco mas abajo.

Otra cosa que podemos hacer con el operador `this` es llamar a otro método de la clase. Vamos con un ejemplo:

```Java
public class Clase {
    private int a;
    private int b;

    public Clase() {
        System.out.println("Ejecutando Constructor sin parámetros");
        this.a = 0;
        this.b = 0;
    }

    public int getValorA() {
        return this.a;
    }
    public int getValorB() {
        return this.b;
    }

    public void muestraTodos() {
        System.out.println("Atributo A: " + this.getValorA() + " " + "Atributo B: " + this.getValorB());
    }
}
```

En el ejemplo anterior, podemos ver como en el método `muestraTodos`, llamamos a los métodos `getValorA` y `getValorB` para recuperar el valor de los atributos. Para ello hacemos uso del operador `this` para indicar que nos estamos refiriendo a los métodos de la propia clase.
