package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner input = new Scanner(System.in);
        int alumno = 1, aprobados = 0, numeroDeNotas = 0;
        float nota = 0, sumatorio = 0, notaMedia;

        //Bucle
        while (nota != -1){
            //Solicitud de datos
            System.out.print("Introduzca la nota del alumno " + alumno + ":");
            nota = input.nextInt();
            alumno++;

            //Solo permite números positivos
            if (nota < -1 && nota > 10){
                System.out.println("El número debe de ser positivo o menor que 10");
                alumno--;
            } else if (nota >= 0 && nota <= 10) {
                sumatorio += nota;
                numeroDeNotas++;
                if (nota >=5){
                    aprobados++;
                }
            }
        }

        //Calcular la media
        notaMedia = sumatorio/numeroDeNotas;

        //Salida de datos
        System.out.printf("La nota media es: %.2f\nEl número de aprovados es: %d", notaMedia, aprobados);

        //Cerrar Scanner
        input.close();
    }
}