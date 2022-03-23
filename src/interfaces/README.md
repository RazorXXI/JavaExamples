# Interfaces

## Definición

 Una interface en Java es parecida a una **clase abstracta**, en la que se especifican uno o mas métodos, pero sin definir la funcionalidad de estos.

 Por lo tanto, podemos decir que una **interface** es como una plantilla que se utiliza para implementar clases. 

 Los métodos de una **interface** suelen ser **abstractos** y sus atributos **finales**.

 La manera de declarar una **interface** es la siguiente:

 ```console
 [Modificador_Acceso] interface Nombre_Interface [extends Nombre_Interface] {

 }
 ```
 * ``[Modificador_Acceso]``: Es la visibilidad que va a tener una interface. Esta puede ser **public** o **package**, el cual es la que tiene por defecto, si no especificamos nada.

 * ``interface``: Es la palabra reservada de Java, para declarar una interface.

 * ``Nombre_Interface``: Es el nombre que le asignamos a la **interface**.

 * ``[extends Nombre_Interface]``: Es opcional e indica si la interface hereda o mejor dicho **extiende** de otra cuyo nombre es indicado.

 Las **interfaces** pueden derivar o *extender* de otras **interfaces** pero nunca de otras clases. La utilidad que plantean las **interfaces** es el poder establecer relaciones entre clases.

 Un detalle es que varias clases pueden implementar las mismas interfaces y a su vez, derivar de otras clases. Este detalle, permite dotar del mecanismo de la **herencia multiple** a Java.

 Un ejemplo de declaración de **interface** lo podemos ver en [InterfaceVehiculo.java](InterfaceVehiculo.java).

 Del mismo modo, podemos ver un ejemplo de como se implementa una **interface** en una clase, en [ClaseMoto.java](ClaseMoto.java).

 Un detalle importante a señalar, es que una **interface** no puede implementar otra **interface**, pero si puede extender de otra. Esto lo podemos ver en [InterfaceVehiculoElectrico.java](InterfaceVehiculoElectrico.java).

 Otro detalle a tener en consideración, es que una clase que implementa una **interface**, debe implementar todos sus métodos, o bien ha de ser declarada como abstracta.

 Una caracteristica que podemos encontrar a partir de Java 8, en relación a las **interface**, son los ``default methods``. Estos, permiten a las interfaces el definir e implementar los métodos mediante código, si la clase que implementa la interface no los define.

 Esto último es bastante útil, si queremos incluir un nuevo método a la interface, sin que afecte a las clases que la esten utilizando.

 