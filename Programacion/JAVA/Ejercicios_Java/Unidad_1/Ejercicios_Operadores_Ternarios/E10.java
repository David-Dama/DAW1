package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importamos Scanner

public class E10 {
    public static void main(String[] args) {

        //Escaner y declaración de variables
        Scanner input = new Scanner(System.in);
        String frase1, frase2;
        String resultado;
        
        //Solicitar información y guardarla en las variables
        System.out.print("Ingrese la frase 1: ");
        frase1 = input.nextLine();
        System.out.print("Ingrese la frase 2: ");
        frase2 = input.nextLine();

        //Operador ternario
        resultado = (frase1.equals(frase2)) ? "Las cadenas son iguales" : "Las cadenas son diferentes";
        
        //Impresión del resultado
        System.out.print(resultado);
        
        //Cerrar Scanner
        input.close();
    }
}