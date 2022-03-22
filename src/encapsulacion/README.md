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

[^1]: Para indicar que un método o atributo tiene el modificador de acceso como *default* simplemente pondremos el mètodo o atributo sin indicar modificador de acceso. Ej: int numero; Este sería un atributo con modificador de acceso *default*