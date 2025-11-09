package Programacion.JAVA.Ejercicios_Java.Unidad2.Funciones;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int num;
        //Solicitud de datos
        System.out.print("Introduzca un numero entero para determinar si es par o impar: ");
        num = input.nextInt();

        //Salida de datos
        System.out.printf("El numero %d es par? %s", num, esPar(num));

        //Cerrar Scanner
        input.close();
    }

    public static boolean esPar(int numEsPar){
        boolean esPar;
        if (numEsPar%2 == 0){
            esPar = true;
        } else {
            esPar = false;
        }
        return esPar;
    }
}
