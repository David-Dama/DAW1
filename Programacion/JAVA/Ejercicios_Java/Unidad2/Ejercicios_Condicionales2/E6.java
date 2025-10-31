/*Escribe un programa que solicite al usuario las longitudes de los tres lados de 
un triángulo (a, b, c), y que determine qué tipo de triángulo es: 
- Equilátero: si los tres lados son iguales. 
- Isósceles: si exactamente dos lados son iguales 
- Escaleno: si ningún lado es igual. 
El  programa  debe  validar  que  el  valor  de todas  las longitudes  es  positivo,  en 
caso contrario, finaliza con un mensaje de error.  */

package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Condicionales2;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        
        //Importar Scanner y declarar variables
        Scanner input = new Scanner(System.in);
        double a, b, c;

        //Solicitar datos al usuario
        System.out.print("Introduce la longitud del lado a: ");
        a = input.nextDouble();
        System.out.print("Introduce la longitud del lado b: ");
        b = input.nextDouble();
        System.out.print("Introduce la longitud del lado c: ");
        c = input.nextDouble();

        //Cálculo y salida de datos + condicionales
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: Las longitudes de los lados deben ser positivas.");
        } else {
            if (a == b && b == c) {
                System.out.println("El triángulo es equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        }

        //Cerrar Scanner
        input.close();
    }
}
