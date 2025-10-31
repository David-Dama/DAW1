

import java.util.Scanner;

public class E4_clasico {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int num1, num2, operacionUsuario, resultado;
        char operacion;
        String mensaje;

        //Entrada de datos
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();
        System.out.print("Seleccione la operación a realizar (+, -, *, /): ");
        operacion = input.next().charAt(0);

        //Operaciones y salida de datos
        switch (operacion){
            case '+':
                System.out.println("Escriba el resultado de " + num1 + " + " + num2 + ": ");
                operacionUsuario = input.nextInt();
                resultado = num1 + num2;
                mensaje = (operacionUsuario == resultado) ? "Correcto" : "Incorrecto. El resultado es " + resultado;
                break;
            case '-':
                System.out.println("Escriba el resultado de " + num1 + " - " + num2 + ": ");
                operacionUsuario = input.nextInt();
                resultado = num1 - num2;
                mensaje = (operacionUsuario == resultado) ? "Correcto" : "Incorrecto. El resultado es " + resultado;
                break;
            case '*':
                System.out.println("Escriba el resultado de " + num1 + " * " + num2 + ": ");
                operacionUsuario = input.nextInt();
                resultado = num1 * num2;
                mensaje = (operacionUsuario == resultado) ? "Correcto" : "Incorrecto. El resultado es " + resultado;
                break;
            case '/':
                System.out.println("Escriba el resultado de " + num1 + " / " + num2 + ": ");
                operacionUsuario = input.nextInt();
                resultado = num1 / num2;
                mensaje = (operacionUsuario == resultado) ? "Correcto" : "Incorrecto. El resultado es " + resultado;
                break;
            default:
                mensaje = "Operación no válida.";
        }
        System.out.println(mensaje);
        
        //Cierre del Scanner
        input.close();
    }
}