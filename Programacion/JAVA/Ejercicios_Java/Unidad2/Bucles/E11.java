package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        
    
    //Scanner y declaracion de vatiables
    Scanner input = new Scanner(System.in);
    String palabra;

    //Bucle
    do {
        System.out.print("Introduzca la palabra en minusculas que quiera ver en mayúsculas: ");
        palabra = input.nextLine();
        if (!palabra.equalsIgnoreCase("fin")){
            System.out.println(palabra.toUpperCase());
        }
    } while (!palabra.equals("fin"));

    //Cerrar Scanner
    input.close();
    }
}