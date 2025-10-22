/*Modifica el programa anterior para que, además de los dos números 
aleatorios,  también  se  proponga  la  operación  que  debe  realizar  el  jugador: 
“suma”, “resta” o “multiplicación”. */

package Programacion.JAVA.Ejercicios_Java.Unidad_2.Ejercicios_Condicionales2;

import java.util.Scanner;

public class E3_elige_maquina {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num1, num2, sumaUsuario, sumaCorrecta, eleccionOperacion;

        //Generación de números aleatorios y elección de operación
        num1 = (int)(Math.random() * 99) + 1;
        num2 = (int)(Math.random() * 99) + 1;
        eleccionOperacion = (int)(Math.random() * 3) + 1; // 1: suma, 2: resta, 3: multiplicación

        //Operaciones y condicionales
        if (eleccionOperacion == 1){
            System.out.print("¿Cuánto es " + num1 + " + " + num2 + "? ");
            sumaUsuario = input.nextInt();
            sumaCorrecta = num1 + num2;

            if (sumaUsuario == sumaCorrecta) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto. La respuesta correcta es " + sumaCorrecta + ".");
            }
        } else if (eleccionOperacion == 2) {
            System.out.print("¿Cuánto es " + num1 + " - " + num2 + "? ");
            int restaUsuario = input.nextInt();
            int restaCorrecta = num1 - num2;

            if (restaUsuario == restaCorrecta) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto. La respuesta correcta es " + restaCorrecta + ".");
            }
        } else if (eleccionOperacion == 3) {
            System.out.print("¿Cuánto es " + num1 + " * " + num2 + "? ");
            int multiplicacionUsuario = input.nextInt();
            int multiplicacionCorrecta = num1 * num2;

            if (multiplicacionUsuario == multiplicacionCorrecta) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto. La respuesta correcta es " + multiplicacionCorrecta + ".");
            }
        } else {
            System.out.println("Operación no válida.");
        }

        //Cerrar Scanner
        input.close();
        }
    }