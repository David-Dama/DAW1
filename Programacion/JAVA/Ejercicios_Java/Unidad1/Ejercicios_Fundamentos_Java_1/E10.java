package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E10 {
    public static void main(String[] args) {

        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num;
        boolean parOimpar;

        //SOlicitar información al usuario y guardar en la variable
        System.out.print("Ingresar un número entero: ");
        num = input.nextInt();

        //Operaciones
        parOimpar = (num % 2 == 0);

        //Imprimir resultado
        System.out.print("El número es par? " + parOimpar);

        //Cerrar Scanner
        input.close();
    }
}
