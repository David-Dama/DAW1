//Pedir al usuario su edad y mostrar la que tendrá el próximo año//

package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E5 {
    public static void main(String[] args){

        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int edad;

        //Solicitar información al usuario y guardarla en variable
        System.out.print("Enter your age: ");
        edad = input.nextInt();

        //Operaciones
        edad = (edad + 1);

        //Imprimir resultado
        System.out.println("Next year you'll be: " + edad);

        //Cerrar Scanner
        input.close();
    }
    
}
