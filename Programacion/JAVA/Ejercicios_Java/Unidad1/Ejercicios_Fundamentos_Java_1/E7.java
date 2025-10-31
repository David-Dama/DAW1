/*Escribe un programa en java que calcule la media aritmética de dos notas enteras. 
Hay que tener en cuenta que la media puede contener decimales. */

package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E7 {
    public static void main(String[] args) {

       //Scanner y declaración de variables 
       Scanner input = new Scanner(System.in);
       double nota1, nota2, media;

       //Solicitar información al usuario y guardarla en las variables correspondientes
       System.out.print("Ingresar la nota 1: ");
       nota1 = input.nextDouble();
       System.out.print("Ingresar nota 2: ");
       nota2 = input.nextDouble();

       //Opoeraciones
       media = ((nota1 + nota2)/2);

       //Impresión del resultado
       System.out.print("Su media es: " + media);
       
       //Cerrar Scanner
       input.close();
    }
    
}
