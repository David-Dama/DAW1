package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; //Importar Scanner

public class E6 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int segIntroducidos, horas, minutos, segundos;

        //Solicitar información y almacenarla en las variables
        System.out.print("Introducir número de segundos: ");
        segIntroducidos = input.nextInt();

        //Operaciones
        segundos = segIntroducidos%60;
        minutos = segIntroducidos/60;
        horas = minutos/60;
        minutos = minutos%60;
        
        //Entrega de información al usuario
        System.out.print("En el número intorducido hay " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");

        //Cerrar Scanner
        input.close();

    }

    
}
