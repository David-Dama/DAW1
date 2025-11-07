package Programacion.JAVA.Ejercicios_Java.Unidad2.Funciones;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        String[] asignaturas = {"BBDD", "PROG", "F.BBDD", "ENT", "ITPE", "LM", "SSII"};
        double sumatorio = 0, notaAsignatura;
        int notaEnRango=0;

        //Bucle para solicitar, almacenar y sumar notas
        while (notaEnRango<7){
            System.out.printf("Ingrese la nota de la asignatura de %s: " , asignaturas[notaEnRango]);
            notaAsignatura = input.nextDouble();
            if (notaAsignatura >= 0 && notaAsignatura <= 10){
                sumatorio += notaAsignatura;
                notaEnRango++;
            } else {
                System.out.println("Valor fuera de rango");
            }
        }
        

        //Imprimir resultado
        System.out.printf("La media del curso completo es: %.2f", hacerMedia(7, sumatorio));
        
        //Cerrar Scanner
        input.close();
    }

    //Creo una función para hacer las operaciones
    public static double hacerMedia(int divisor, double notas){
        double media;
        media = (double)notas/divisor;
        return media;
    }
}