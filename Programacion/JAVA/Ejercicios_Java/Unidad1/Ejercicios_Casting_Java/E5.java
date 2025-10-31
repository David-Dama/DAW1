/*Escribe un programa que tome un carácter (por ejemplo, 'A') y lo convierta a su valor 
numérico ASCII mediante casting. Luego, convierte ese valor numérico nuevamente al 
carácter correspondiente.  */
package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Casting_Java;

import java.util.Scanner; //Importar Scanner

public class E5 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num;
        char caracter;

        //Solicitar informaciñon al usuario y guardarlo en la variable
        System.out.print("Introducir caracter: ");
        caracter = input.next().charAt(2);

        //Casteo
        num = (int)caracter;

        //Imprimir resultado
        System.out.println(num);
        System.out.println(caracter);

        //Cerrar Scanner
        input.close();
    }
    
}
