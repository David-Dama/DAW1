package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
    
        //Declaración de variables
        Scanner input = new Scanner(System.in);
        int num, numParaHacerMultiplicación, resultado = 1;

        //Solicitud de datos
        System.out.print("Introduzca el número del que quiere conocer el factorial: ");
        num = input.nextInt();
        numParaHacerMultiplicación = num;

        //Bucle para poner la multiplicación
        if (numParaHacerMultiplicación > 10){
            System.out.print(numParaHacerMultiplicación + "x...x3x2x1= ");
        } else {
            while(numParaHacerMultiplicación != 0){
                System.out.print(numParaHacerMultiplicación + "x");
                numParaHacerMultiplicación--;
            }
            System.out.print("= ");
        }
        
        //Operaciones
        for (int i = num; i != 0; i--){
            resultado *= i; 
        }

        //Salida del resultado
        System.out.print(resultado);

        //Cerrar Scanner
        input.close();
    }    
}
