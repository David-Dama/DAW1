

import java.util.Scanner;

public class E3_clasico {
    public static void main(String[] args) {
        
        //SCanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int mes;

        //Solicitar mes
        System.out.print("Ingrese un número del 1 al 12 para determinar el mes: ");
        mes = input.nextInt();

        //Switch para determinar el mes
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Error. Por favor ingrese un número del 1 al 12.");
                break;
        }

        //Cerrar Scanner
        input.close();
    }
}
