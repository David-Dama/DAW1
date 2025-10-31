package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Condicionales1;

import java.util.Scanner; //Importar Scanner

public class E3 {
    public static void main(String[] args) {

        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int anyo;

        //Solicitud y almacenamiento de datos
        System.out.print("Introducir un año: ");
        anyo = input.nextInt();

        //Condicionales (Tiene que ser divisible entre 4, 100 y 400)
        if (anyo%4 == 0){
            if (anyo%100 == 0){
                if (anyo%400 == 0){
                    System.out.print("¿Es el año " + anyo + " bisiesto? : true");
                } else {
                    System.out.print("¿Es el año " + anyo + " bisiesto? : false");
                }
            } else {
                System.out.print("¿Es el año " + anyo + " bisiesto? : true");
            }
        } else {
            System.out.print("¿Es el año " + anyo + " bisiesto? : false");
        }

        //Cerrar Scanner
        input.close();
    }
}
