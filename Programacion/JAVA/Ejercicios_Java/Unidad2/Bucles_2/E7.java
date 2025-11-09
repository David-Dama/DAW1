package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int numeroUsuario, numeroAleatorio;;

        //Crear número aleatorio
        numeroAleatorio = (int)(Math.random() * 100) + 1;

        //Introduccion de datos
        System.out.print("Introduce un número entre 1 y 100 (ambos inclusive): ");
        numeroUsuario = input.nextInt();

        //Bucle
        while (numeroUsuario != numeroAleatorio){
            if (numeroUsuario == -1){ 
                System.out.println("¡La próxima vez saldrá mejor!");
                break;
            } else if (numeroUsuario <= -1 || numeroUsuario > 100 || numeroUsuario == 0){ //Que se repita hasta el acierto o la rendidión aunque se introduzcan valores fuera de rango
                System.out.print("Número fuera de rango, ingrese un número válido (1-100): ");
                numeroUsuario = input.nextInt();
            } else if (numeroUsuario > numeroAleatorio){
                System.out.print("El número es menor, vuelva a intentarlo: ");
                numeroUsuario = input.nextInt();
            } else {
                System.out.print("El número es mayor, vuelva a intentarlo: ");
                numeroUsuario = input.nextInt();
            }
        }

        //Mensaje acierto
        if (numeroUsuario == numeroAleatorio) {    
            System.out.println("¡Felicidades! Acertasete el número");
        }
        
        //Cerrar Scanner
        input.close();
    }
}