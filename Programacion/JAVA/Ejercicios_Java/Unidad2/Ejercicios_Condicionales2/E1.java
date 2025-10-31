/*Escribe una aplicación que solicite por consola dos números reales que
corresponden a la base y la altura de un triángulo. Deberá mostrarse su área,
comprobando que los números introducidos por el usuario no son negativos ni
igual a cero.*/

package Programacion.JAVA.Ejercicios_Java.Unidad_2.Ejercicios_Condicionales2;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        //Scanner y variables
        Scanner input = new Scanner(System.in);
        double base, altura, area;

        //Entrada de datos
        System.out.print("Introduce la base del triángulo: ");
        base = input. nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        altura = input. nextDouble();

        //Cálculo y salida de datos
        if (base > 0 && altura > 0) {
            area = (base * altura) / 2;
            System.out.println("El área del triángulo es: " + area);
        } else {
            System.out.println("La base y la altura deben ser números positivos y mayores que cero.");

        //Cerrar Scanner
        input.close();
        }
    }
}
