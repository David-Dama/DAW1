package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importar Scanner

public class E1 {
    public static void main(String[] args) {

        //Escaner y declaracón de variables
        Scanner input = new Scanner(System.in);
        int num;
        String numeroEntregado;

        //Solicitar información al usuario y guardar en la variable
        System.out.print("Escriba un número entero: ");
        num = input.nextInt();

        //Operador ternario
        numeroEntregado = (num > 0) ? "Positivo" : (num == 0)  ? "0" : "Negativo";

        //Impresión del resultado
        System.out.print(numeroEntregado);

        //Cerrar Scanner
        input.close();
    }
    
}
