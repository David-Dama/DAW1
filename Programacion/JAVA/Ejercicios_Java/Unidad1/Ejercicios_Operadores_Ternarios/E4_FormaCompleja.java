package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importar Scanner2

public class E4_FormaCompleja {
    public static void main(String[] args) {

        //Escaner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num1;
        String resultado;

        //Solicitar información al usuario y guardar la información en la variable
        System.out.print("Ingresar un número entero: ");
        num1 = input.nextInt();

        //Operadores ternarios
        resultado = (num1!=0) ? 
            (num1%2 == 0) ? 
                (num1%5 == 0) ?
                    "Es divisible entre ambos" : "Solo es par" : 
                (num1%5 == 0) ?
                    "Solo es divisible entre 5" : "No es divisible entre 5 ni par" :
        "Debe ingresar un número distinto a 0";

        //Impresión del resultado
        System.out.print(resultado);

        //Cerrar Scanner
        input.close();
    }
    
}