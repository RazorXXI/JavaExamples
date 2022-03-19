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

Un ejemplo de esto, lo podemos ver en el ejemplo de la [Clase Coche](coche.java), la cual sería la clase padre o superclase y la [Clase Ford](ford.java), que seria la subclase de `Coche` y a su vez la [Clase FordScort](fordscort.java) que sería subclase de la clase `Ford`.

[^1]: Programación Orientada a Objetos. A lo largo de las explicaciones lo verás como POO.