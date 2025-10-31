package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Repaso;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        //Importar Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        double precioPatata = 2.8, kiloPatata, precioTomate = 4.7, kiloTomate, precioLechuga = 2, kiloLechuga, total;

        //Entrada de datos
        System.out.print("Ingrese los kilos de patatas solicitados: ");
        kiloPatata = input.nextDouble();
        System.out.print("Ingrese los kilos de tomates solicitados: ");
        kiloTomate = input.nextDouble();   
        System.out.print("Ingrese los kilos de lechugas solicitados: ");
        kiloLechuga = input.nextDouble();

        //Operaciones
        total = (precioPatata * kiloPatata) + (precioTomate * kiloTomate) + (precioLechuga * kiloLechuga);

        //Salida de datos
        System.out.print("El total de la compra es " + total + " euros.");

        //Cierre del Scanner
        input.close();
    }
    
}
