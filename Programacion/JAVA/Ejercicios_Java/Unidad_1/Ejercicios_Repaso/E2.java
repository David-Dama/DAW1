package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Repaso;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        double distancia, tiempo, velocidad;
        
        //Entrada de datos
        System.out.print("Ingrese la distancia recorrida (en km): ");
        distancia = input.nextDouble();
        System.out.print("Ingrese el tiempo empleado (en horas): ");
        tiempo = input.nextDouble();

        //Calculo de la velocidad
        velocidad = distancia / tiempo;

        //Salida de datos
        System.out.print("La velocidad es de " + velocidad + " km/h");

        //Cierre del Scanner
        input.close();
    }
}
