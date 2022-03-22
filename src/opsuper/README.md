# Operador **super**

Para entender como funciona el operador `super`, debemos tener antes claro como se comportan los constructores en la herencia. Ello se puede resumir en los siguientes puntos:

 1 - La `clase hija` hereda todos los métodos y atributos, excepto el constructor de la `clase padre`.
 2 - Cuando se crea un objeto de la clase hija, primero se ejecuta el constructor por defecto de la clase padre y posteriormente, el de la clase hija.

