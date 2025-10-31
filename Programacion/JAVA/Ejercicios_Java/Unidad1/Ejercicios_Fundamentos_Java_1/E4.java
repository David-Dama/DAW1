/*Escribe un programa en java que:
- Solicite un número entero y lo almacene en un variable 
- Modifique el valor de la variable anterior incrementando en 2 el valor que ha 
  introducido el usuario 
- Imprima el nuevo valor por pantalla */

package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E4 {
    public static void main(String[] args){

      //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num1;
      
      //Solicitar información al usuarioy guardar en la variable
        System.out.print("Ingresar número entero: ");
        num1 = input.nextInt();

      //Operaciones
        num1 = (num1 + 2);

      //Imprimir resultado
        System.out.println(num1);
        
      //Cerrar Scanner
        input.close();
    }
    
}
