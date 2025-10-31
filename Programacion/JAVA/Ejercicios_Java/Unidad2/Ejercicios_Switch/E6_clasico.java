
 
import java.util.Scanner;

public class E6_clasico {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        String destino, residencia;
        final double DESCUENTOPMI = 0.25; 
        
        //Solicitud de datos y descuento
        System.out.println("Destino al que viaja (MAD, PMI, VLC, ZGZ): ");
        destino = input.next().toUpperCase();
    
        System.out.println("Indique su lugar de residencia (MAD, PMI, VLC, ZGZ...): ");
        residencia = input.next().toUpperCase();

        //Switch para determinar el precio del billete
        switch (destino) {
            case "MAD":
                System.out.println("El destino seleccionado es MAD.\nEl precio de su billete es de 120 euros.");
                break;
            case "PMI":
                if (residencia.equalsIgnoreCase("PMI")){
                    System.out.println("El destino seleccionado es PMI.\nEl precio de su billete es de " + (240 * DESCUENTOPMI) + " euros debido al descuento del 75%.");
                }
                break;
            case "VLC":
                System.out.println("El destino seleccionado es VLC.\nEl precio de su billete es de 85 euros.");
                break;
            case "ZGZ":
                System.out.println("El destino seleccionado es ZGZ.\nEl precio de su billete es de 160 euros.");
                break;
            default:
                System.out.println("Destino no disponible, introduzca un destino valido.");
                break;
        }

        //Cierre del scanner
        input.close();
    }
}
