package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int numA, numB, divisor = 0;
        boolean restoEs0 = false;

        //Introducir datos
        System.out.print("Introduzca el numero A: ");
        numA = input.nextInt();
        System.out.print("Introduzca el numero B: ");
        numB = input.nextInt();

        //Identificar cual es el mayor
        if (numA > numB) {
            divisor = numB;
        } else if (numA < numB) {
            divisor = numA;
        } else {
            System.out.printf("El MCD es %d", numA);
            restoEs0 = true;
        }
            
        while (!restoEs0) {
            restoEs0 = (numA%divisor == 0) && (numB%divisor == 0);
            if (restoEs0) {
                System.out.printf("El MCD es %d", divisor);
            } 
            divisor--;
        }
        //Cerrar Scanne
        input.close();
    }
}
