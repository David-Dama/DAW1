package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Repaso;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int num1, num2;
        boolean sonIguales;

        //Entrada de datos
        System.out.print("Ingrese el primer numero entero: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = input.nextInt();

        //Comparacion de los numeros
        sonIguales = (num1 == num2);

        //Salida de datos
        System.out.println("Los numeros son iguales: " + sonIguales);

        //Cierre del Scanner
        input.close();
    }
}
