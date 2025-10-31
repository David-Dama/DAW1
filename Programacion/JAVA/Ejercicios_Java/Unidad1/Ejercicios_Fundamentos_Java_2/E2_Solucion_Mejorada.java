package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; //Importar Scanner

public class E2_Solucion_Mejorada {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num1, resultado;

        //Solicitar y almacenar información
        System.out.print("Ingresar un número entero: ");
        num1 = input.nextInt();

        //Operaciones
        resultado = (num1%7 == 0) ? 0 : (num1%7 > 0) ? (7-num1%7) : (-7-num1%7);

        //Imprimir resultado
        System.out.print(resultado);

        //Cerrar Scanner
        input.close();
    }
    
}