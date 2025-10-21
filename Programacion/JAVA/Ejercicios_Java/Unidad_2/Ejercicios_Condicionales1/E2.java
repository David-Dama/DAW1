package Programacion.JAVA.Ejercicios_Java.Unidad_2.Ejercicios_Condicionales1;

import java.util.Scanner; //Importar Scanner

public class E2 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int edad;
        String respuesta;

        //Solicitud y almacenado de datos
        System.out.print("Cual es su edad? ");
        edad = input.nextInt();

        //Condiciones
        if (edad<16 || edad>65) { //Si tiene -16 o +65 se concede acceso preferente
            System.out.print("Se concede acceso preferente");
        }
        else {//Si la edad está entre 16 y 65 pregunto si va acompañado de alguien preferente
            System.out.print("Va acompañado de una persona menos de 16 años o mayor de 65? (S/N)");
            respuesta = input.next();

            if (respuesta.equalsIgnoreCase("S")) {//Si dice que si se le concede
                System.out.print("Se concede acceso preferente");
            }
            else {//Sino no
                System.out.print("No se concede acceso preferente");
            }
        }

        //Cerrar Scanner
        input.close();
    }
}
