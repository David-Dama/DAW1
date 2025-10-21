package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importar Scanner

public class E5 {
    public static void main(String[] args) {

        //Escaner y declaración de variables
        Scanner input = new Scanner(System.in);
        double num1;
        String numero;

        //Solicitar información al usuario y guardar información en la variable
        System.out.print("Ingresar un número: ");
        num1 = input.nextDouble();

        //Operador ternario
        numero = (num1>=100 && num1<=200) ? "Dentro de rango" : "Fuera de rango";
        
        //Impresión del resultado
        System.out.print(numero);

        //Cerrar Scanner
        input.close();
    }
    
}
