package Programacion.JAVA.Ejercicios_Java.Unidad2.Funciones2;

import java.util.Scanner;

public class E3 {
    public static void main (String[] args){
        //Declaración de variables
        Scanner input = new Scanner(System.in);
        int cantidadNumeros;

        //Solicitud de datos
        do { //Comprobar que es mayor o igual que 0
            System.out.print("Ingrese la cantidad de numeros aleatorios que desea ver: ");
            cantidadNumeros = input.nextInt();
            if (cantidadNumeros < 0){
                System.out.println("Debe ingresar una cantidad de numero mayor o igual que 0.");
            }
        } while (cantidadNumeros <= 0);

        //Bucle para que salgan el numero de veces pedido
        for (int i = cantidadNumeros; i > 0; i--) {
            System.out.println(aleatorio(cantidadNumeros));
        }
        input.close();
    }

    //FUNCIONES

    //Funcion sobrecargada
    public static double aleatorio(int cantidadNumeros){
            return (Math.random() * (1 - 0) + 0);
    }

    //Función de validación
    public static boolean distintoA0(int cantidadNumeros){
        boolean valido;
        valido = cantidadNumeros >= 0;
        return valido;
    }
}
