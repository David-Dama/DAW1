package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int num = -1;

        //Entrada de datos
        System.out.print("Introduce un numero (0 para salir): ");
        num = input.nextInt();

        //Bucle para pedir numeros hasta que se introduzca un 0
        while (num != 0) {
            if (num%2 == 0) {
                System.out.println("El numero " + num + " es par.");
            } else {
                System.out.println("El numero " + num + " es impar.");
            }

            if (num > 0) {
                System.out.println("El numero " + num + " es positivo.");
            } else {
                System.out.println("El numero " + num + " es negativo.");
            }

            System.out.println("Su cuadrado es: " + Math.pow(num, 2));

            System.out.print("Introduce un numero (0 para salir): ");
            num = input.nextInt();
        }

        //Cierre del scanner
        input.close();
    }
}