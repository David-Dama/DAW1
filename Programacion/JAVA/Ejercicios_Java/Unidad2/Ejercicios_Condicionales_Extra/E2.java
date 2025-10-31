package Programacion.JAVA.Ejercicios_Java.Unidad_2.Ejercicios_Condicionales_Extra;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int res, dniNum;
        String dniTexto;
        char letra;

        //Solicitud de datos
        System.out.print("Ingrese su número de DNI: ");
        dniTexto = input.nextLine();

        //Limitar a 8 dígitos
        if (dniTexto.length() == 8){
        
            //String to Int
            dniNum = Integer.parseInt(dniTexto);

            //Operaciones
            res = dniNum%23;

            //Switch
            letra = switch (res) {
                case 0 -> 'T';
                case 1 -> 'R';
                case 2 -> 'W';
                case 3 -> 'A';
                case 4 -> 'G';
                case 5 -> 'M';
                case 6 -> 'Y';
                case 7 -> 'F';
                case 8 -> 'P';
                case 9 -> 'D';
                case 10 -> 'X';
                case 11 -> 'B';
                case 12 -> 'N';
                case 13 -> 'J';
                case 14 -> 'Z';
                case 15 -> 'S';
                case 16 -> 'Q';
                case 17 -> 'V';
                case 18 -> 'H';
                case 19 -> 'L';
                case 20-> 'C';
                case 21 -> 'K';
                case 22 -> 'E';
                default -> ' ';
            };
        
            //Salida de datos
            if (letra == ' '){
                System.out.println("Ingrese un número de DNI válido");
            } else {
                System.out.println("La letra que le corresponde es: " + letra);
            }  
        } else {
            System.out.println("Error. Debe introducir un DNI válido (8 caráteres). ");
        }

        //Cerrar Scanner
        input.close();
    }
}