package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
    
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int edad = 1, catidadAlumnos = 0, mayoresEdad = 0, alumnos = 1;
        float sumaEdades = 0, mediaEdades = 0;

        while (edad > 0){
            
            //Solicitud de datos
            System.out.printf("Introduzca la edad del alumno %d: ", alumnos);
            edad = input.nextInt();

            //Diferenciación entre edad positiva y negativa
            if (edad < 0){
                System.out.println("Se ha introducido una edad negativa, cerrando programa.");
                alumnos--;
            } else {
                if (edad >= 18){
                    mayoresEdad++;
                }

                //Suma de todas las edades
                sumaEdades += edad;
            
                //Media
                mediaEdades = sumaEdades/alumnos;

                //Sumamos un alumno
                alumnos++;
            }
        }

        //Salida de datos
        System.out.printf("\nLa suma total de las edades es: %.0f\nLa media de edades es: %.2f\nEl número de alumnos es: %d\nHay %d mayor/es de edad", sumaEdades, mediaEdades, alumnos, mayoresEdad);
    
        //Cerrar Scanner
        input.close();
    }
}