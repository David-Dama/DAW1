package Programacion.JAVA.Ejercicios_Java.Unidad2.Funciones;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args){
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num1, num2;
        char operador;

        //SOlicitud de datos
        System.out.print("Introduzca el número 1: ");
        num1 = input. nextInt();
        System.out.print("Introduzca el numero 2: ");
        num2 = input. nextInt();
        System.out.print("Introduzca un operador (+, -, *, /). Si no se escoge operador hará una suma de manera automática: ");
        operador = input.next().charAt(0);

        //Depurador + salida de datos 
        if (operador == '+'){
            System.out.printf("El resultado es: %.2f", operacion(num1, num2));
        } else if (operador == '-' || operador == '*' || operador == '/'){
            System.out.printf("El resultado es:  %.2f", operacion(num1, num2, operador));
        } else {
            System.out.print("El operador introducido es inválido");
        }

        //Cerramos el Scanner
        input.close();
    }

    //Funcion sobrercargada
    public static double operacion(double num1, double num2){
        return num1 + num2;
    }

    //Funcion sobrecargad
    public static double operacion(double num1, double num2, char operador) {
        return switch (operador) {
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> num1 / num2;
        };
    }
}
