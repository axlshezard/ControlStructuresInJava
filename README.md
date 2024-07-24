


# Proyecto de Estructuras de Control en Java

## Descripción

Este proyecto demuestra el uso correcto de las estructuras de control en el lenguaje de programación Java. Incluye ejemplos detallados de estructuras condicionales, bucles y declaraciones de control de bucles.

## Estructuras de Control

### Estructuras Condicionales

Las estructuras condicionales permiten que el programa tome decisiones basadas en ciertas condiciones. En Java, se utilizan las siguientes estructuras:

#### `if` / `else if` / `else`

Permite evaluar múltiples condiciones y ejecutar el código correspondiente.

```java
int x = 10;

if (x < 0) {
    System.out.println("x es negativo");
} else if (x == 0) {
    System.out.println("x es cero");
} else {
    System.out.println("x es positivo");
}
```

**Explicación:**
- `if (x < 0)`: Si `x` es menor que 0, se imprime "x es negativo".
- `else if (x == 0)`: Si `x` es igual a 0, se imprime "x es cero".
- `else`: Para cualquier otro valor de `x`, se imprime "x es positivo".

### Bucles

Los bucles permiten ejecutar un bloque de código repetidamente mientras se cumpla una condición.

#### `for`

Se utiliza para iterar un número conocido de veces.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

**Explicación:**
- `for (int i = 0; i < 5; i++)`: Itera desde `i = 0` hasta `i < 5`, incrementando `i` en 1 en cada iteración.
- `System.out.println(i)`: Imprime el valor actual de `i`.

#### `while`

Se utiliza cuando el número de iteraciones no se conoce de antemano y depende de una condición.

```java
int count = 0;
while (count < 5) {
    System.out.println(count);
    count++;
}
```

**Explicación:**
- `while (count < 5)`: Continúa el bucle mientras `count` sea menor que 5.
- `System.out.println(count)`: Imprime el valor actual de `count`.
- `count++`: Incrementa `count` en 1 en cada iteración.

### Declaraciones de Control de Bucles

Estas declaraciones permiten modificar el flujo de ejecución dentro de los bucles.

#### `break`

Sale inmediatamente del bucle cuando se cumple una condición.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Sale del bucle
    }
    System.out.println(i);
}
```

**Explicación:**
- `if (i == 5)`: Cuando `i` es igual a 5, se ejecuta `break`, saliendo del bucle.
- `System.out.println(i)`: Imprime los valores de `i` hasta que se alcance el `break`.

#### `continue`

Omite la iteración actual del bucle y pasa a la siguiente iteración.

```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue; // Salta los números pares
    }
    System.out.println(i);
}
```

**Explicación:**
- `if (i % 2 == 0)`: Si `i` es par, se ejecuta `continue`, omitiendo el resto del bucle para ese valor.
- `System.out.println(i)`: Imprime solo los números impares.

#### Uso de `pass` (comentario en Java)

Java no tiene una instrucción `pass`. En su lugar, se utilizan comentarios para indicar la ausencia de acción.

```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        // No se realiza ninguna acción para números pares
    } else {
        System.out.println(i);
    }
}
```

**Explicación:**
- `if (i % 2 == 0)`: No se realiza ninguna acción para números pares, equivalente a `pass` en otros lenguajes.
- `System.out.println(i)`: Imprime los números impares.

## Cómo Ejecutar los Ejemplos

1. **Clona el Repositorio**:
   ```sh
   git clone https://github.com/tu-usuario/controlstructuresinjava.git
   ```
2. **Navega al Directorio**:
   ```sh
   cd controlstructuresinjava
   ```
3. **Compila el Código**:
   ```sh
   javac ControlStructuresDemo.java
   ```
4. **Ejecuta el Programa**:
   ```sh
   java ControlStructuresDemo
   ```


## Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.

## Contacto

Para cualquier pregunta o comentario, por favor contacta a [JC](mailto:jcgarciasolis007@gmail.com).

```
