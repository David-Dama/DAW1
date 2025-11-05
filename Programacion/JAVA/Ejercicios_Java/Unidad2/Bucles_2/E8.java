package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int numUsuario;

        //Solicitud de datos
        System.out.print("Ingrese el numero de asteriscos: ");
        numUsuario = input.nextInt();
        
        //Bucle for
        for (int i = numUsuario; i > 0; i--){
            numUsuario=i;
            while (numUsuario>0){
                System.out.print("*");
                numUsuario--;
            }
            System.out.println();
        }

        //Cerrar Scanner
        input.close();
    }
}
