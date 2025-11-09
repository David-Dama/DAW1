package Programacion.JAVA.Ejercicios_Java.Unidad2.Funciones;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int num, contador = 1;

        //Solicitud de datos
        System.out.printf("Introduzca el numero entero numero %d. Si es par solicitara otro numero, si es impar se cerrara el programa: ", contador);
        num = input.nextInt();
        contador++;

        //Bucle
        do {
            System.out.printf("Introduzca el numero entero numero %d: ", contador);
            num = input.nextInt();
            contador++;
        } while (esPar(num));
        
        if (!esPar(num)){
            System.out.printf("El numero %d es impar. Cerrando programa.", num);
        }

        //Cerrar Scanner
        input.close();
    }

    public static boolean esPar(int numEsPar){
        boolean esPar;
        if (numEsPar%2 == 0){
            esPar = true;
        } else {
            esPar = false;
        }
        return esPar;
    }
}
