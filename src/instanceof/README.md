# Operador instanceof

El operador `instanceof` nos va a permitir verificar el tipo de un objeto. Es usado para comprobar si un objeto es de una clase, una subclase o un interfaz.

Sun sintaxis es:

```console
objeto instanceof clase/subclase/interface
```

Un ejemplo lo podemos ver en el código de [RunInstanceOf](RunInstanceOf.java).

Aquí hacemos uso de `instanceof` para comprobar si un electrodoméstico es de una clase u otra.

# Método finalize

El método `finalize`, es llamado justo antes de que un objeto sea eliminado por el `Garbage Collector`. Este se llama cuando el recolector de basura, determina que ya no existen mas referencias al objeto.

Podemos redefinir el método `finalize` para eliminar recursos de un objeto y así minimizar la perdida de memoria.

Es imporante que sepas que, `finalize` se llama una sola vez, aunque dicho objeto pueda ser seleccionado por el `Garbage Collector` varias veces.

Este método, es muy empleado para eliminar conexiones con bases de datos, cerrar flujos de ficheros principalmente. Aunque según recomendaciones de Oracle, quien es el actual desarrollador de Java, no se aconseja el uso de `finalize` y por tanto, se está bien la posibilidad de eliminar este en futuras versiones.

Un ejemplo de método `finalize` podría ser perfectamente este:

```Java
public void finalize() throws Throwable {
	System.out.println("Finalizando Objeto");
	super.finalize();
}
```

