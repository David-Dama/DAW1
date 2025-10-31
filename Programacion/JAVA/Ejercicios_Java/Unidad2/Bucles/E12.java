package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int numAnterior = 1, numActual = -numAnterior,  acumulador = 0;

        //Bucle for
        while (numActual != numAnterior){
            System.out.print("Introduzca el número: ");
            numAnterior = input.nextInt();
            acumulador += numAnterior;
            if (numActual == numAnterior){
                break;
            }
            System.out.print("Introduzca el número: ");
            numActual = input.nextInt();
            acumulador += numActual;
        }
        
        //Dos numeros iguales seguidos
        System.out.println("Valor repetido. El total de la suma es: " + acumulador);

        //Cerrar Scanner
        input.close();
    }
}