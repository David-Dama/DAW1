package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; //Importar Scanner

public class E10 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        double num, resultado;

        //Solicitud y almacenamiento de informaión
        System.out.print("Introducir un número positivo: ");
        num = input.nextDouble();

        //Operaciones
        resultado = Math.sqrt(num);

        //Impresión del resultado
        System.out.print("El resultado es: " + resultado);

        //Cerrar Scanner
        input.close();
    }
    
}
