package Programacion.JAVA.Ejercicios_Java.Unidad2.Funciones2;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args){
        //Creacion de variables
        Scanner input = new Scanner(System.in);
        int hora1, hora2, minuto1, minuto2;

        //Solicitud de datos
        System.out.print("Ingrese la hora 1: ");
        hora1 = input.nextInt();
        System.out.print("Ingrese los minutos 1: ");
        minuto1 = input.nextInt();
        System.out.print("Ingrese la hora 2: ");
        hora2 = input.nextInt();
        System.out.print("Ingrese los minutos 2: ");
        minuto2 = input.nextInt();

        //Salida de datos y llamada a la función
        System.out.printf("La diferencia es de %d minutos", diferenciaMin(hora1, minuto1, hora2, minuto2));

        input.close();
    }

    //Función operaciones
    public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int horaAmin1, horaAmin2;

        //Pasar de horas a minutos
        horaAmin1 = (hora1 * 60) + minuto1;
        horaAmin2 = (hora2 * 60) + minuto2;

        //Operar y retornar
        if (horaAmin1 > horaAmin2) {
            return horaAmin1 - horaAmin2;
        } else if (horaAmin1 < horaAmin2) {
            return  horaAmin2 - horaAmin1;
        } else {
            return 0;
        }
    }
}

