package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importar Scanner

public class E9 {
    public static void main(String[] args) {

        //Escaner y declaración de variables
        Scanner input = new Scanner(System.in);
        char caracter;
        int numASCII;
        String resultado;

        //Solicitar inforación al usuario y guardarla en las variables
        System.out.print("Ingresar un carácter:");
        caracter = input.next().charAt(0);

        //Casteo
        numASCII = (int)caracter;

        //Operadores ternarios
        resultado = ((numASCII>=65 && numASCII<=90) || (numASCII>=97 && numASCII<=122)) ?
            (numASCII>=65 && numASCII<=90) ?
                "Es mayúscula" : "Es minúscula":
            "No es una letra, introduza un carácter válido";

        //Impresión del resultado
        System.out.print(resultado);

        //Cerrar Scanner
        input.close();
    }
}
