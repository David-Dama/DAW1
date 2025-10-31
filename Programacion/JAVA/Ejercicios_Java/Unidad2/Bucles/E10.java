package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int numN, num, acumulador = 0;

        //Entrada de datos
        System.out.print("Introduzca un número entero: ");
        numN = input.nextInt();

        //Bucle for
        for (int i = 0; i != numN; i++){
            System.out.print("Introduzca el número: ");
            num = input.nextInt();
            acumulador += num;
        }

        //Salida de datos
        System.out.println("La media es: " + ((double)acumulador/numN));

        //Cerrar Scanner
        input.close();
    }
}
