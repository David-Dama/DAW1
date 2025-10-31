package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Switch;

import java.util.Scanner;  

public class E1_nuevo {
    public static void main(String[] args) {

        //Scanner y variables
        Scanner input = new Scanner(System.in);
        int num;

        //Solicitar numero
        System.out.print("Ingrese un numero del 1 al 7: ");
        num = input.nextInt();

        //Switch para dias de la semana
        switch (num) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número inválido. Por favor ingrese un número del 1 al 7.");
        }

        //Cerrar Scanner
        input.close();
    }
}