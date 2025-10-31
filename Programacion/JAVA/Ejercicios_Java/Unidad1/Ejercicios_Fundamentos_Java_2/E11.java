package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; //Importar Scanner

public class E11 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int a, b;
        String resultado;

        //Solicitud y almacenamiento de información
        System.out.print("Introduce el valor númerico de 'a':" );
        a = input.nextInt();
        System.out.print("Introducir el valor númerico de 'b': ");
        b = input.nextInt();

        //Ternario
        resultado = (a == b) ? "son iguales" : "son distintos";

        //Impresión del resultado
        System.out.print("'a' y 'b' " + resultado);

        //Cerrar Scanner
        input.close();
    }
}
