package Programacion.JAVA.Ejercicios_Java.Unidad_2.Bucles;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int num;

        //Pedir numero al usuario
        System.out.print("Introduce el número de veces que quiers que se repita la plabra eco: ");
        num = input.nextInt();

        //Bucle
        while (num > 0) {
            System.out.println("eco");
            num--;
        }

        //Cerrar scanner
        input.close();
    }
}
