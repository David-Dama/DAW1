package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E12 {
    public static void main(String[] args) {

        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num;

        //Solicitar información al usuario y guardarla en la variable
        System.out.print("Ingresa un número entero, ya sea positivo o negativo: ");
        num = input.nextInt();

        //Operaciones
        int result = (num>=0) ? num : -num;
        
        //Imprimir resultado
        System.out.print("El número en valor absoluto es: " + result);

        //Cerrar Scanner
        input.close();
    }
}
