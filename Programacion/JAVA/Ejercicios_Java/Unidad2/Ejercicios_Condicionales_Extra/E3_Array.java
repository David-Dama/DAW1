package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Condicionales_Extra;

import java.util.Scanner;

public class E3_Array {
    public static void main(String[] args) {
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num;
        String[] unidades, decenas, especiales;
        boolean cerrarPrograma = false;
        char cerrarProgramaSoN;

        //Le doy los valores a los arrays
        unidades = new String[]{"diez", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        decenas = new String[]{"", "", "", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        especiales = new String[]{"veinte", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};

            do {
            //Pido el número
            System.out.print("Introduzca un número: ");
            num = input.nextInt();

            //Condicionales
            if (num >= 1 && num <= 99){
                if (num <= 10){
                    System.out.println(unidades[num%10]);
                } else if (num >= 10 && num <= 20){
                    System.out.println(especiales[num%10]);
                } else if (num > 20 && num < 30){
                    System.out.printf("veinti%s%n", unidades[num%10]);
                } else if (num%10 == 0){
                    num /= 10;
                    System.out.println(decenas[num]);
                } else {
                    System.out.printf("%s y %s%n", decenas[num/10], unidades[num%10]);
                }
            } else {
                System.out.println("Valor fuera de rango, introduzca uno válido");
            }

            //Bucle para cerrar programa
            do {
                System.out.println("Desea cerrar el programa? S/N"); //Mensaje para cerrar el programa
                cerrarProgramaSoN = input.next().charAt(0);
                if (cerrarProgramaSoN == 'S' || cerrarProgramaSoN == 's') { //La S se traduce en true para el booleano
                    cerrarPrograma = true;
                } else if (cerrarProgramaSoN == 'N' || cerrarProgramaSoN == 'n') { //La S se traduce en true para el booleano
                    cerrarPrograma = false;
                } else { //Si no es ni S ni N reinicia el bucle y sale mensaje de error
                    System.out.println("Debe introducir S o N para poder continuar, otros valores no serán aceptados.");
                }
            } while (!(cerrarProgramaSoN == 'S' || cerrarProgramaSoN == 's' || cerrarProgramaSoN == 'N' || cerrarProgramaSoN == 'n'));
        } while (!cerrarPrograma);

        //Menajes de cerrando programa
        System.out.println("\nCerrando programa.");

        //Cerrar Scanner
        input.close();
    }
}
