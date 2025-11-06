package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner input = new Scanner(System.in);
        String palabra = null;
        int empiezanPorA = 0, empiezanPorM = 0, resto = 0, conteo = 1;
        char primeraLetra; 

        //Bucle
        while (!palabra.equalsIgnoreCase("salir")){ 
            System.out.print("Introduzca la palabra " + conteo + ": ");
            palabra = input.nextLine();
            if (palabra.equalsIgnoreCase("salir")){
                System.out.println("Saliendo del programa");
            } else {
                conteo++;

                //Guardar la primera letra en el char
                primeraLetra = palabra.charAt(0);

                //Condicionales para identificar la primera letra
                if (primeraLetra == 'A') {
                    empiezanPorA++;
                } else if (primeraLetra == 'M') {
                    empiezanPorM++;
                } else {
                    resto++;
                }
            }
        }

        //Salida de datos
        System.out.printf("\nPalabras que empiecen por la letra 'A' hay: %d\nPalabras que empiecen por la letra 'M' hay: %d\nPalaras que no empiecen ni por 'A' ni por 'M': %d", empiezanPorA, empiezanPorM, resto);

        //Cerrar Scanner
        input.close();
    }
}