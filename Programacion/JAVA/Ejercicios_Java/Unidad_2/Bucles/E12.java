package Programacion.JAVA.Ejercicios_Java.Unidad_2.Bucles;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num = 1, acumulador = 0;

        //Bucle for
        while (acumulador != num){
            System.out.print("Introduzca el número: ");
            num = input.nextInt();
            
        }

    }
}