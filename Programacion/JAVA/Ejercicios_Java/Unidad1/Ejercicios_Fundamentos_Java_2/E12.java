package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; // Importar Scanner

public class E12 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        double distancia;

        //Solicitud de infromación
        System.out.print("Ingresar distancia en metros: ");
        distancia = input.nextDouble();

        //Operaciones
        distancia = distancia * 100;

        //Impresión del resultado
        System.out.print("La distancia en centimetros es: " + (int)distancia + " cm.");

        //Cerrar Scanner
        input.close();
    }
    
}
