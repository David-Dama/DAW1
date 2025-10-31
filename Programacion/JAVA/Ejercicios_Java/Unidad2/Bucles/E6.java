package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        
    //Scanner y declaración de variables
    Scanner input = new Scanner(System.in);
    int num, acumulador = 1;

    //Entrada de datos
    System.out.print("Introduzca un número entero: ");
    num = input.nextInt();
    
    //Comprobar si es par o impar + bucle
    if (num >= 1){ //Que sea positivo
        if (num > 2){ //Mayor que 2
            for (int i = 1; i <= num; i += 2){
                System.out.println(acumulador);
                acumulador += 2;  
            }
        }else{
            System.out.println(acumulador);
        }
    } else {
        System.out.println("Debe introducir un número mayor o igual a 1");
    }
    
    //Cerrar Scanner
    input.close();
    }
}