package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importar Scanner

public class E4 {
    public static void main(String[] args) {

        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num1;
        String resultado;

        //Solicitar información al usuario y guardarlo en la variable
        System.out.print("Ingresar un número entero: ");
        num1 = input.nextInt();

        //Operador ternario
        resultado = (num1%2 == 0 || num1%5 == 0) ? "Si es par o divisible entre 5" : "No es par o divisible entre 5";
        
        //Impresión del resultado
        System.out.print(resultado);

        //Cerrar Scanner
        input.close();
    }
    
}
