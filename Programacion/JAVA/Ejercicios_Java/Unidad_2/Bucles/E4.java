package Programacion.JAVA.Ejercicios_Java.Unidad_2.Bucles;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num, num2, acumulador = 0;

        //Solicitud de datos
        System.out.print("Introduzca el primer número: ");
        num = input.nextInt();
        System.out.print("Ibtroduza el segundo número: ");
        num2 = input.nextInt();

        //Bucle
        for (int i = num; i<=num2; i++){
            acumulador += i;
        }

        //Salida de datos
        System.out.println("El resultado es: " + acumulador);

        //Cerrar Scanner
        input.close();
    }
}
