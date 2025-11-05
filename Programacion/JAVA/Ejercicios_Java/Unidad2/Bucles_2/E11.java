package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int horas = 1, minutos = 1, segundos = 1, segundosIncrementados, valoresFueraDeRango, totalSegundos;
        boolean cerrarPrograma = false;
        char cerrarProgramaSoN;

        //Bucle 
        do {
            //Bucle para solicitar horas, minutos y segundos y que estén en rango
            do {
                //Mensaje de error
                if (!(horas >= 0 && horas < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos < 60)) {
                    System.out.println("\nAlgunos de los valores que ha introducido son incorrectos.\nRecuerda que las horas deben de estar entre '0' y '23' y tanto los minutos como los segundos entre '0' y '59'.");
                }
                
                //Entrada de datos
                System.out.print("\nIntroduzca la hora: ");
                horas = input.nextInt();

                System.out.print("Introduzca los minutos: ");
                minutos = input.nextInt();
            
                System.out.print("Introduzca los segundos: ");
                segundos = input.nextInt();

            } while (!(horas >= 0 && horas < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos < 60));

            //Solicitud de incremento
            do { //Bucle para solicitar incremento hasta que de un valor positivo      
                System.out.print("Ingrese el numero de segundos que desea incrementar: ");
                segundosIncrementados = input.nextInt();
                if (segundosIncrementados < 0) {
                    System.out.println("Ingrese una cantidad de segundos a incrementar positiva");
                }
            }while (segundosIncrementados < 0 );
            
            //Mostramos en pantalla la hora actual
            System.out.printf("\nLa hora actual es -> %2s:%2s:%2s\n", ((horas >= 0 && horas < 10 ) ? "0" + horas : horas), ((minutos >= 0 && minutos < 10) ? "0" + minutos : minutos), ((segundos >= 0 && segundos < 10) ? "0" + segundos : segundos));

            //Pasamos la hora actual a segundos
            totalSegundos = horas * 3600 + minutos * 60 + segundos;

            // Sumamos el incremento
            totalSegundos += segundosIncrementados;

            // Ajustamos para que no supere las 24 horas (86400 segundos)
            totalSegundos %= 86400;

            // Convertimos de nuevo a horas, minutos y segundos
            horas = totalSegundos / 3600;
            minutos = (totalSegundos % 3600) / 60;
            segundos = totalSegundos % 60;

            //Mostramos la hora incrementada
            System.out.printf("La hora incrementada es -> %2s:%2s:%2s\n\n", ((horas >= 0 && horas < 10 ) ? "0" + horas : horas), ((minutos >= 0 && minutos < 10) ? "0" + minutos : minutos), ((segundos >= 0 && segundos < 10) ? "0" + segundos : segundos));
            
            //Bucle 
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
        System.out.println("Cerrando programa.");

        //Cerrar Scanner
        input.close();
    }
}