/*Escribe un programa en java,
- que solicite un número entero 
- multiplique x2 el valor introducido y lo guarde en una variable 
- imprima por pantalla “El número introducido, multiplicado por 2 es: X”, donde X 
  es el valor de la variable que almacena el dato calculado  */
package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E2 {
    public static void main(String[] args){
      
      //Scanner y declaración de variables
      Scanner input = new Scanner(System.in);
      int num;

      //Solicitar información al usuario y guardarla en la variable
      System.out.println("Enter an integer number:");
      num = input.nextInt();

      //Imprimir resultado
      System.out.println("El número introducido, multiplicado por 2 es: " + (num * 2));
      
      //Cerrar Scanner
      input.close();
    }

}
