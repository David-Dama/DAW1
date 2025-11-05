package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Condicionales_Extra;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num, unidadesInt, decenasInt, especialesInt;
        String unidadesString, decenasString, especialesString = null;

        //Entrada de datos
        System.out.print("Introduzca un número entre el 1 y el 100, ambos inclusive: ");
        num = input.nextInt();

        //Operaciones
        unidadesInt = num % 10;
        decenasInt = num / 10;
        especialesInt = num;

        //Asignar unidad y decena a String
        
        switch (unidadesInt){
            case 1 -> unidadesString = "uno";
            case 2 -> unidadesString = "dos";
            case 3 -> unidadesString = "tres";
            case 4 -> unidadesString = "cuatro";
            case 5 -> unidadesString = "cinco";
            case 6 -> unidadesString = "seis";
            case 7 -> unidadesString = "siete";
            case 8 -> unidadesString = "ocho";
            case 9 -> unidadesString = "nueve";
            default -> unidadesString = "";
        }
        switch (decenasInt){
            case 1 -> decenasString = "diez";
            case 2 -> decenasString = "veinte";
            case 3 -> decenasString = "treinta";
            case 4 -> decenasString = "cuarenta";
            case 5 -> decenasString = "cincuenta";
            case 6 -> decenasString = "sesenta";
            case 7 -> decenasString = "setenta";
            case 8 -> decenasString = "ochenta";
            case 9 -> decenasString = "noventa";
            default -> decenasString = "";
        }
        switch (especialesInt){
            case 10 -> especialesString = "diez";
            case 11 -> especialesString = "once";
            case 12 -> especialesString = "doce";
            case 13 -> especialesString = "trece";
            case 14 -> especialesString = "catorce";
            case 15 -> especialesString = "quince";
            case 16 -> especialesString = "dieciséis";
            case 17 -> especialesString = "diecisiete";
            case 18 -> especialesString = "dieciocho";
            case 19 -> especialesString = "diecinueve";
            case 20 -> especialesString = "veinte";
        }

        //Condicionales
        if (num >= 1 && num <= 99){
            if (num < 10){
                System.out.println(unidadesString);
            } else if (num >= 10 && num <= 20){
                System.out.println(especialesString);
            } else if (num > 20 && num < 30){
                System.out.println("veinti" + unidadesString);
            } else {
                System.out.printf("%s y %s", decenasString, unidadesString);
            }
        } else {
            System.out.print("El número introducido está fuera de rango.");
        };

        //Cerrar Scanner
        input.close();
    }
}