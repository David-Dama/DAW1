package Programacion.JAVA.Ejercicios_Java.Unidad_2.Bucles;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int numTabla, numMultiplicar = 0;

        //Pedir numero al usuario
        System.out.print("Introduce el número de la tabla de multiplicar que quieres (0-10): ");
        numTabla = input.nextInt();

        //Bucle
        while (numMultiplicar <= 10){
            System.out.println(numTabla + " x " + numMultiplicar + " = " + (numTabla * numMultiplicar));
            numMultiplicar++;
        }

        //Cerrar scanner
        input.close();
    }
}
