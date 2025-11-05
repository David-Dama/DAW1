package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int horasInt = 1, minutosInt = 1, segundosInt = 1, horasIncrementadas = 0, minutosIncrementados = 0, segundosIncrementados = 0;
        String horasString, minutosString, segundosString;

        //Instrucciones de como cerrar el programa
        System.out.println("Introduzca un valor negativo en 'horas', 'minutos' o 'segundos' para cerrar el programa.");

        while (horasInt >= 0 && minutosInt >= 0 && segundosInt >= 0){
            //Entrada de datos
            System.out.print("Introduzca la hora: ");
            horasInt = input.nextInt();
            if (horasInt < 0 || minutosInt < 0 || segundosInt < 0){ //Si algun valor es negativo el bucle se cierra
                break;
            }
            System.out.print("Introduzca los minutos: ");
            minutosInt = input.nextInt();
            if (horasInt < 0 || minutosInt < 0 || segundosInt < 0){ //Si algun valor es negativo el bucle se cierra
                break;
            }
            System.out.print("Introduzca los segundos: ");
            segundosInt = input.nextInt();
            if (horasInt < 0 || minutosInt < 0 || segundosInt < 0){ //Si algun valor es negativo el bucle se cierra
                break;
            }

            //Pasar de int a String
            segundosString = Integer.toString(segundosInt);
            minutosString = Integer.toString(minutosInt);
            horasString = Integer.toString(horasInt);

            //Poner 0 delante en el caso de que haga falta
            if (horasInt >= 0 && horasInt < 10){
                horasString = "0" + horasInt;
            }
            if (minutosInt >= 0 && minutosInt < 10){
                minutosString = "0" + minutosInt;
            }
            if (segundosInt >= 0 && segundosInt < 10){
                segundosString = "0" + segundosInt;
            }

            //Solicitud de incremento
            System.out.print("Ingrese el numero de segundos que desea incrementar: ");
            segundosIncrementados = input.nextInt();
            
            //Reevaluacion para que los valores entren en rango
            if (segundosIncrementados >= 60){ 
                minutosIncrementados = segundosIncrementados/60;
                segundosIncrementados %= 60;
            }
            if (minutosIncrementados >= 60) {
                    horasIncrementadas = minutosIncrementados/60;
                    minutosIncrementados %= 60;
            }
            if (horasIncrementadas >= 24) {
                horasIncrementadas %= 24;
            }

            //Mostramos en pantalla la hora actual
            System.out.printf("La hora actual es -> %2s:%2s:%2s\n", horasString, minutosString, segundosString);
            
            //Sumamos las horas actuales con el incremento
            horasInt += horasIncrementadas;
            minutosInt += minutosIncrementados;
            segundosInt += segundosIncrementados;

            //Reevaluamos las horas, minutos y segundos para que esten dentro de rango
            if (segundosInt >= 60){ 
                minutosIncrementados = segundosInt/60;
                minutosInt += minutosIncrementados;
                segundosInt %= 60;
            }
            if (minutosInt >= 60) {
                    horasIncrementadas = minutosInt/60;
                    horasInt += horasIncrementadas;
                    minutosInt %= 60;
            }
            if (horasInt >= 24) {
                horasInt %= 24;
            }

            //Pasamos nuestro nuevo tiempo de Int a String
            segundosString = Integer.toString(segundosInt);
            minutosString = Integer.toString(minutosInt);
            horasString = Integer.toString(horasInt);

            //Poner 0 delante en el caso de que haga falta
            if (horasInt >= 0 && horasInt < 10){
                horasString = "0" + horasInt;
            }
            if (minutosInt >= 0 && minutosInt < 10){
                minutosString = "0" + minutosInt;
            }
            if (segundosInt >= 0 && segundosInt < 10){
                segundosString = "0" + segundosInt;
            }

            //Mostramos la hora con el tiempo sumado
            System.out.printf("La hora incrementada es -> %2s:%2s:%2s\n\n", horasString, minutosString, segundosString);
        }   

        //Cerrar Scanner
        input.close();
    }
}
/*NOTAS
 * Tengo que hacer que si se mete un incremento negativo de error y pregunte de nuevo
 * No permitir meter mas d 23 horas, 60 mins y cosas asi
 * revisar y optimizar codigo, revisar bucles e intentar evitar los breaks, ademas de ver si puedo evitar repetir codigo o usar bucles
 */