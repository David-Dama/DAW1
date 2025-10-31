/*Escribe un programa en java que: 
- solicite dos números enteros 
- devuelva como resultado la suma de los dos números.  */

package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E3 {
    public static void main(String[] args){

        //Scaner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        //Solicitar información al usuario y guardarla en las variables correspondientes
        System.out.println("Enter the first number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();

        //Imprimir resultado
        System.out.println("The result is: " + (num1 + num2));
        
        //Cerrar Scanner
        input.close();
    }
    
}
