# Herencia en Java

## Concepto de Herencia

La **herencia** es el mecanismo en POO[^1], mediante el cual podemos crear clases nuevas a partir de otras ya existentes.

Cuando una clase hereda de otra clase, esta *reutiliza* sus atributos, métodos, además de las relaciones que pudiera tener con otras clases.

La clase que hereda de otra, se conoce como **subclase** y a la clase de la que hereda esta, se la conoce como **superclase**.


## Como declarar un objeto que herada de otro

La manera de declarar la herencia en Java, es mediante el uso de la palabra reservada `extends`.
Mediante esta, le estamos diciendo a Java, que la clase que estamos declarando, hereda de otra.

La sintaxis es la siguiente:

```console
[ModificadorVisibilidad] NombreClase extends ClasePadre { 

}
```

Un ejemplo de esto, lo podemos ver en el ejemplo de la [Clase Coche](Coche.java), la cual sería la clase padre o superclase y la [Clase Ford](Ford.java), que seria la subclase de `Coche` y a su vez la [Clase FordScort](FordScort.java) que sería subclase de la clase `Ford`. 

Como podemos ver, la `herencia` nos permite establecer relaciones entre objetos. Pero la herencia no es el único mecanismo para establecer relaciones.

## Otras formas de establecer relaciones entre objetos
### Relación de Agregación

La `agregación` consiste en crear un objeto desde una clase, al cual llamamo `objeto contenedor` el cual va a incluir referencias a otros objetos, que serán de otra clase y a los que llamaremos `objetos contenidos`.

Un detalle muy importante de este tipo de relaciones, es que si se destruye el `objeto contenedor`, no se destruyen los `objetos contenidos`. Lo que sucede, es que unicamente se destruye la relación entre esos objetos.

Podemos ver un ejemplo de esto en [RunAgregacion](RunAgregacion.java).
### Relación de Composición

La relación de `composición`, es aquella en la que existe un `objeto contenedor` el cual está formado por objetos de otra clase a los cuales llamamos `objetos contenidos`. Esto siginifica, que la vida de los `objetos contenidos` está limitada a la vida del `objeto contenedor`.

En este tipo de relaciones, si se destruye el `objeto contenedor`, se destruyen los `objetos contenidos`.

Un ejemplo de este tipo de relaciones, lo vemos en la clase [CentroComercial](CentroComercial.java), en la cual tenemos un método llamada `construirTienda`, en el cual creamos dentro de esta, un objeto de tipo [Tienda](Tienda.java). Al destruir el objeto `centroComercial` en el ejemplo [RunAgregacion](RunAgregacion.java), también estamos destruyendo el objeto `Tienda`.

## Conversiones
Las conversiones, en Java pueden ser de dos tipos
 1 - Implicitas.
 2 - Explicitas.

Podemos ver un ejemplo de ambos tipos de conversiones en [RunConversion](RunConversion.java).
### Convesiones Implicitas

Java permite convertir un referencia a una clase derivada en una referncia a una clase base implicitamente.

Si las **clases están relacionadas mediante herencia**, si podemos realizar este tipo de conversiones.

### Conversiones Explicitas

Son aquellas en las que se usa algún tipo de sintaxis, para convertir una referencia a una clase base, en una referencia a una clase derivada, utilizando el mecanismo del **casting**.

[^1]: Programación Orientada a Objetos. A lo largo de las explicaciones lo verás como POO.
