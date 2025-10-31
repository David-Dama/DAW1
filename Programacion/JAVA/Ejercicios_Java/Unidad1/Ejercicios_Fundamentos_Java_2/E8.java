package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; //Importar Scanner

public class E8 {
    public static void main(String[] args) {

        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int hormigas, arañas, cochinillas, resultado;

        //Solicitud y almacenamientoo de información
        System.out.print("Introducir número de hormigas: ");
        hormigas = input.nextInt();
        System.out.print("Introducir número de arañas: ");
        arañas = input.nextInt();
        System.out.print("Introducir número de cochinillas: ");
        cochinillas = input.nextInt();

        //Operaciones
        resultado = (hormigas * 6) + (arañas * 8) + (cochinillas * 14);

        //Impresión del resultado
        System.out.print("El número total de patas es: " + resultado);

        //Cerrar Scanner
        input.close();
    }
}
