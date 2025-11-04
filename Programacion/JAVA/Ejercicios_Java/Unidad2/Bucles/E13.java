package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        String color = "a";
        int conteo = 0, azul = 0;

        //Bucle while
        while (!color.equalsIgnoreCase("negro")){
            System.out.print("Introduzca un color: ");
            color = input.nextLine();
            if (color.equals("azul")){
                azul++;
            }
            conteo++;
        }

        //Mostrar resultados
        System.out.printf("Se han introducido %d colores, de los cuales %d eran azules.", conteo, azul);

        //Cerrar Scanner
        input.close();
    }    
}
