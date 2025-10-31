package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importar Scanner

public class E7 {
    public static void main(String[] args) {

        //Escaner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num1;
        String resultado;

        //Solicitar información al usuario y guardarla en las variables
        System.out.print("Ingresar un número entero: ");
        num1 = input.nextInt();

        //Operadores ternarios
        resultado = (num1!=0) ? 
            (num1%3 == 0) ? 
                (num1%7 == 0) ?
                    "Es divisible entre ambos" : "Solo es divisible entre 3" : 
                (num1%7 == 0) ?
                    "Solo es divisible entre 7" : "No es divisible entre ninguno" :
        "Debe ingresar un número distinto a 0";

        //Impresión del resultado
        System.out.print(resultado);

        //Cerrar Scanner
        input.close();
    }
    
}
