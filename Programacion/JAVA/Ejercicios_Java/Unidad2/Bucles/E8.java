package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int acumulador = 1, multiplicador, num;

        //Bucle
        for (int i = 1; i <= 9; i++){
            System.out.print("Introduzca el número: ");
            num = input.nextInt();
            multiplicador = acumulador;
            acumulador *= num;
            System.out.println(num + "*" + multiplicador + "=" + acumulador);
        }

        //Cerrar Scanner
        input.close();
    }
}
