package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Condicionales_Extra;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int num, unidad, decena, centena, unidadM;

        //Entrada de datos
        System.out.print("Ingrese un numero entero comprendido entre 0 y 9999: ");
        num = input.nextInt();

        //Operaciones
        unidad = (num % 10);
        decena = (num / 10) % 10;
        centena = (num / 100) % 10;
        unidadM = (num / 1000) % 10;

        //Condicionales
        if (num >= 0 && num <=9999){
            if (unidadM != 0) { //Comprueba si es de 4 digitos
                if (unidad == unidadM && decena == centena) { 
                    System.out.println("El numero " + num + " es capicua.");
                } else {
                    System.out.println("El numero " + num + " no es capicua.");
                }
            } else if (unidadM == 0 && centena != 0) { //Comprueba si es de 3 digitos    
                if (unidad == centena) { 
                    System.out.println("El numero " + num + " es capicua.");
                } else {
                    System.out.println("El numero " + num + " no es capicua.");
                }
            }else if (unidadM == 0 && centena == 0 && decena != 0) { //Comprueba si es de 2 digitos
                if (unidad == decena) { 
                        System.out.println("El numero " + num + " es capicua.");
                } else {
                    System.out.println("El numero " + num + " no es capicua.");
                }
            }else if (num >= 0 && num < 10) { //Comprueba si es de 1 digito
                System.out.println("El numero " + num + " es capicua.");
            }else{
                System.out.println("El numero " + num + " no es capicua.");
            }
        } else {
            System.out.println("El numero ingresado no esta comprendido entre 0 y 9999.");
        }

        //Cierre del Scanner
        input.close();
    }
}
    

