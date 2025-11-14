package Programacion.JAVA.Ejercicios_Java.Unidad2.Funciones2;

import java.util.Scanner;

public class E2 {
    public static void main (String[] args){
        //Declaración de variables
        Scanner input = new Scanner(System.in);
        int cantidadNumeros, valorMin, valorMax;

        //Solicitud de datos
        do {
            System.out.print("Ingrese la cantidad de numeros aleatorios que desea ver: ");
            cantidadNumeros = input.nextInt();
            if (cantidadNumeros < 0){
                System.out.println("Debe ingresar una cantidad de numero mayor o igual que 0.");
            }
        } while (cantidadNumeros <= 0);
        System.out.print("Ingrese el mínimo: ");
        valorMin = input.nextInt();
        System.out.print("Ingrese el máximo: ");
        valorMax = input.nextInt();

        for (int i = cantidadNumeros; i > 0; i--) {
            System.out.println(aleatorio(cantidadNumeros, valorMin, valorMax));
        }
        input.close();
    }

    public static int aleatorio(int cantidadNumeros, int valorMin, int valorMax){
        return cantidadNumeros = (int)(Math.random()*valorMax)+valorMin;
    }

    public static boolean distintoA0(int cantidadNumeros){
        boolean valido;
        valido = cantidadNumeros >= 0;
            return valido;
    }
}
