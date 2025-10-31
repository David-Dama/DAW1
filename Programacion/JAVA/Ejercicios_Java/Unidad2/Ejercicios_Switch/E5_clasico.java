

import java.util.Scanner;

public class E5_clasico {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        double distancia;
        String unidadMedida;

        //Entrada de datos
        System.out.print("Ingrese la distancia (en metros) a convertir: ");
        distancia = input.nextDouble();
        System.out.print("Ingrese la unidad de medida a convertir (km, cm, mm): ");
        unidadMedida = input.next().toLowerCase();

        //Proceso y salida de datos
        switch (unidadMedida){
            case "km":
                System.out.println(distancia + " metros son " + (distancia / 1000) + " kilómetros.");
                break;
            case "cm":
                System.out.println(distancia + " metros son " + (distancia * 100) + " centímetros.");
                break;
            case "mm":
                System.out.println(distancia + " metros son " + (distancia * 1000) + " milímetros.");
                break;
            default:
                System.out.println("Unidad de medida no válida. Por favor, ingrese 'km', 'cm' o 'mm'.");
                break;
        }

        //Cierre del scanner
        input.close();
    }
    
}
