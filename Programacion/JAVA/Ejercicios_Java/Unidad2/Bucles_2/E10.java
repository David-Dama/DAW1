package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        //Scanner y declarfacion de variables
        Scanner input = new Scanner(System.in);
        int numUsuario, copiaNumUsuario, resto;
        String binario = "";


        //Solicitud de datos
        System.out.print("Introduzca el numero que desea pasar a binario: ");
        numUsuario = input.nextInt();

        //Copiamos el valor del numero introducido
        copiaNumUsuario = numUsuario;

        //Bucle
        while (numUsuario >= 1){
            resto = numUsuario % 2;
            binario = resto + binario;
            numUsuario /= 2;
        }

        //Salida de datos
        System.out.printf("El numero %d en binario es: %s", copiaNumUsuario, binario);

        //Cerrar Scanner
        input.close();
    }    
}
