# Polimorfismo

## Que es el polimorfismo

Es el mecanismo que nos permite que tengamos un método en una clase padre y poderlo sobreescribir en sus clases hijas. Por lo tanto, tendremos el mismo método en ambas clases, pero realizando diferentes acciones. En resumen, el **polimorfismo** no es otra cosa, que la sobreescritura de métodos.

Según la definición técnica del concepto, el polimorfismo es una *relajación del sistema de tipos*.

Como podemos intuir, el **polimorfismo** y la **herencia** están intimamente ligados. Esto es debido, a que se consigue implementar el concepto de **polimorfismo** a traves de la jerarquia de clases que se establecen mediante la **herencia**.

## Tipos de polimorfismo

Si tenemos en cuenta lo anteriormente dicho, podemos atender a tres tipos de **polimorfismo**:

 - **Sobrecarga**: En este tipo, existen métodos con identico nombre en clases que son totalmente independientes.
 - **Paramétrico**: Son aquellos que sus métodos tienen el mismo nombre, pero diferentes parámetros, tanto en tipo como en cantidad.
 - **Inclusión**: Es aquel que redefine por completo un método de una superclase, en una subclase utilizando una interaz común.