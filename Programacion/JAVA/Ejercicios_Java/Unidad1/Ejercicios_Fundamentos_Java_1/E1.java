/*Escribe un programa en java que solicite un número entero por pantalla y que una vez 
introducido por el usuario imprima “El número introducido es X”, siendo X el número 
en cuestión.*/
package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar SCanner

public class E1 {
    public static void main(String[] args){
        
        //Escaner y declaración de variables
        Scanner sc = new Scanner(System.in);
        int num; 

        //Solicitar información al usuario y guardarla en la variable
        System.out.println("Enter an integer number:");
        num = sc.nextInt();

        //Imprimir resultado
        System.out.println("Given number is: " + num);
        
        //Cerrar Scanner
        sc.close();
    }

}