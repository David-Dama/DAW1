package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importar Scanner

public class E6 {
    public static void main(String[] args) {

        //Escaner y dclaración de variables
        Scanner input = new Scanner(System.in);
        int num1;
        String numero;

        //SOlicitar información al usuario y guardarla enla variable
        System.out.print("Ingresar un número: ");
        num1 = input.nextInt();

        //Operadores ternarios
        numero = ((num1>=100 && num1<=250) || (num1>=300 && num1<=350)) ?
                "Dentro de rango" : "Fuera de rango";

        //Impresión del resultado
        System.out.print(numero);
        
        //Cerrar Scanner
        input.close();
    }
}