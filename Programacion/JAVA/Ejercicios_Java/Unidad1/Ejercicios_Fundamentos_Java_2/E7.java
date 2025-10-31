package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; //Importar Scanner

public class E7 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        double milimetros, centimetros, metros, resultado;

        //Solicitud y almacenamientos de informacion
        System.out.print("Introduzca una distancia en milimetros: ");
        milimetros = input.nextDouble();
        System.out.print("Introduzca una distancia en centímetros: ");
        centimetros = input.nextDouble();
        System.out.print("Introduzca una distancia en metros: ");
        metros = input.nextDouble();

        //Operaciones
        milimetros = milimetros/10;
        metros = metros * 100;
        resultado = milimetros + centimetros + metros;

        //Entrega del resultado
        System.out.print("El resultado es: " + resultado + " cm.");
        
        //Cerrar Scanner
        input.close();
    }
    
}
