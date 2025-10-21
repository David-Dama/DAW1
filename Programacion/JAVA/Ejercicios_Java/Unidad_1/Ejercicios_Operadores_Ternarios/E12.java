package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importamos la clase Scanner

public class E12 {
    public static void main(String[] args) {
        
        //Escaner y declaración de variables
        Scanner input = new Scanner(System.in); 
        String colorCinturon, resultado; 

        //Solicitamos al usuario el color del cinturon y guaramos la información en la variable
        System.out.print("Introducir color del cinturon: "); 
        colorCinturon = input.next(); 

        //Operador ternario
        resultado = (colorCinturon.equals("Blanco")) ? 
            "Nivel iniciación" : (colorCinturon.equalsIgnoreCase("Amarillo")) ?
                "Nivel iniciación" : "Nivel avanzado";

        //Impresión del resultado
        System.out.print(resultado);
        
        //Cerrar Scanner
        input.close(); 
    }
}