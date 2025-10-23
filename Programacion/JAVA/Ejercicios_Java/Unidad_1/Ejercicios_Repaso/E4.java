package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Repaso;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int nota;
        String resultado;

        //Entrada de datos
        System.out.print("Introduce una nota entre 0 y 10: ");
        nota = input.nextInt();

        //Operador ternario
        resultado = (nota < 0 || nota > 10) ? "Nota no valida" : (nota >= 5) ? "Se ha aprobado la prueba." : "Se ha suspendido la prueba.";

        //Salida de datos
        System.out.println(resultado);

        //Cerrar el scanner
        input.close();
    }
}
