/**
 * Programa de ejemplo que demuestra el uso de todas las estructuras de control en Java.
 * Este programa incluye ejemplos de estructuras condicionales, bucles y declaraciones de control de bucles.
 */
public class ControlStructuresDemo {

    public static void main(String[] args) {
        // **Estructuras Condicionales**
        // Esta sección usa if, else if y else para evaluar una condición.

        int x = 10; // Variable para las demostraciones condicionales
        System.out.println("Estructuras Condicionales:");

        // Evaluación condicional usando if, else if y else
        if (x < 0) {
            // Si x es menor que 0, se imprime que x es negativo
            System.out.println("x es negativo");
        } else if (x == 0) {
            // Si x es igual a 0, se imprime que x es cero
            System.out.println("x es cero");
        } else {
            // Para cualquier otro valor de x, se imprime que x es positivo
            System.out.println("x es positivo");
        }

        // **Bucles**
        // Esta sección muestra el uso de bucles for y while.

        System.out.println("\nBucles:");

        // Bucle for
        System.out.println("Bucle for:");
        for (int i = 0; i < 5; i++) {
            // Imprime los valores de i desde 0 hasta 4
            System.out.println(i);
        }

        // Bucle while
        System.out.println("Bucle while:");
        int count = 0; // Variable de control para el bucle while
        while (count < 5) {
            // Imprime el valor actual de count y luego lo incrementa
            System.out.println(count);
            count++;
        }

        // **Declaraciones de Control de Bucles**
        // Esta sección demuestra el uso de break, continue y un comentario como 'pass'.

        System.out.println("\nDeclaraciones de Control de Bucles:");

        // Uso de break: Salir del bucle cuando i es igual a 5
        System.out.println("Bucle con break:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // Sale del bucle cuando i es igual a 5
                break; // Salir del bucle
            }
            // Imprime los valores de i hasta que se alcance el break
            System.out.println(i);
        }

        // Uso de continue: Saltar la iteración actual del bucle cuando i es par
        System.out.println("Bucle con continue:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // Salta la iteración actual si i es par
                continue; // Saltar la impresión de números pares
            }
            // Imprime los valores de i cuando i es impar
            System.out.println(i);
        }

        // Uso de pass: No hay equivalente directo a 'pass' en Java, se usa un comentario
        System.out.println("Bucle con pass (comentario en Java):");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // No se realiza ninguna acción para números pares
                // Equivalente al 'pass' en otros lenguajes
            } else {
                // Imprime los números impares
                System.out.println(i);
            }
        }
    }
}
