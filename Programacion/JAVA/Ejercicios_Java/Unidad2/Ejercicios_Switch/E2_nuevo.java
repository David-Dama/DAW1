package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Switch;

import java.util.Scanner;

public class E2_nuevo {
    public static void main(String[] args) {
        
        //Scanner y variables
        Scanner input = new Scanner(System.in);
        char calificacion;
        
        //Solicitar calificacion
        System.out.print("Ingrese una calificación (A, B, C, D, F): ");
        calificacion = input.next().toUpperCase().charAt(0);

        //Switch para interpretar calificacion
        switch (calificacion){
            case 'A' -> System.out.println("Sobresaliente");
            case 'B' -> System.out.println("Notable");
            case 'C' -> System.out.println("Bien");
            case 'D' -> System.out.println("Suficiente");
            case 'F' -> System.out.println("Suspendido");
            default  -> System.out.println("Calificación inválida. Por favor ingrese A, B, C, D o F.");
        }
        
        //Cerrar Scanner
        input.close();
    }
    
}
