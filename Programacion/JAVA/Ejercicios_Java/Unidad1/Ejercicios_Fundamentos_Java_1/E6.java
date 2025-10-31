/*Escribe un programa en java que pida el año actual y el de nacimiento del usuario. 
Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido 
años. */

package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E6 {
    public static void main(String[] args){

        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int anyoNacimiento;
        int anyoActual;
        int edad;

        //Solicitar información al usuario y guardarlo en las variables correspondientes
        System.out.print("Introducir año de nacimiento: ");
        anyoNacimiento = input.nextInt();
        System.out.print("Introducir año actual: ");
        anyoActual = input.nextInt();

        //Operaciones
        edad = anyoActual - anyoNacimiento;

        //Imprimir resultado
        System.out.print("Su edad actual es: " + edad);

        //Cerrar Scanner 
        input.close();
    }
    
}
