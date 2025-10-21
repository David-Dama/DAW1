package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Fundamentos_Java_2;

import java.util. Scanner; //Importar Scanner

public class E9 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        double entradaInfantil, entradaAdulto, precioTotal, precioFinal;

        //Solicitud de información y almacenamiento en las variables
        System.out.print("Introducir número de entradas infantiles: ");
        entradaInfantil = input.nextDouble();
        System.out.print("Introducir número de entradas de adultos: ");
        entradaAdulto = input.nextDouble();

        //Operaciones
        precioTotal = (entradaInfantil * 15.50) + (entradaAdulto * 20);
        precioFinal = (precioTotal >= 100) ? 
            (precioTotal-(0.05*precioTotal)) : precioTotal;

        //Impresión del resultado
        System.out.print("El precio total a pagar es " + precioFinal + "$");

        //Cerrar Scanner
        input.close();
    }
}
