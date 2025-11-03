package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles;

import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        String numTexto;
        int tamaño, num;

        //Solicitar numero
        System.out.print("Introduzca un numero positivo: ");
        numTexto = input.nextLine();

        //Guardar tamaño del numero
        tamaño = numTexto.length();

        //Pasar de String a int
        num = Integer.parseInt(numTexto);

        //Condicon para num = positivo
        if (num < 0){
            System.out.println("El numero introducido no es positivo.");
        } else {
            //Bucle 
            for (int i = tamaño; i > 0; i--) {
                System.out.print((num % 10) + " ");
                num /= 10;
            }
        }
         //Cerrar Scanner
        input.close();
    }   
}
