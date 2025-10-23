

import java.util.Scanner;

public class E3_nuevo {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int mes;
         
        //Solicitar mes
        System.out.print("Ingrese un número del 1 al 12 para determinar el mes: ");
        mes = input.nextInt();

        //Switch para determinar el mes 
        String nombreMes = switch (mes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "Error. Por favor ingrese un número del 1 al 12.";
        };

        System.out.println(nombreMes);

        //Cerrar Scanner
        input.close();
    }
}
