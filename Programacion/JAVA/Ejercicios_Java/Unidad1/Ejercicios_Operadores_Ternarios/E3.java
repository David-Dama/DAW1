package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importar Scanner

public class E3 {
    public static void main(String[] args) {

        //Escaner y declaración de variables
        Scanner input = new Scanner(System.in);
        int temperatura;
        String calorOfrio;

        //Solicitar información al usuario y guardarla en la variable
        System.out.print("Ingresar temperatura actual en grados Celsius: ");
        temperatura = input.nextInt();

        //Operador ternario
        calorOfrio = (temperatura>=30) ? "Hace calor" : "Hace frío";
        
        //Imprimir resultado
        System.out.print(calorOfrio);
        
        //Cerrar Scanner
        input.close();
    }
    
}