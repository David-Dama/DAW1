package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int edadMax = 0, edadMin = 100, edad = 0, cantidadAlumnos = 1;

        //Entrada de datos y bucle
        while (edad != -1){
            System.out.print("Introduzca la edad del alumno " + cantidadAlumnos + ": ");
            edad = input.nextInt();
            cantidadAlumnos++;
                if (edad < edadMin && edad != -1){
                    edadMin = edad;
                } else if (edadMax < edad && edad != -1){
                    edadMax = edad;
                }
        }

        //Salida de datos 
        if (edadMin < -1 || edadMax < -1){
            System.out.println("Debe introducir edades válidas (mayores o iguales a 0), no se aceptarán otros resultados");
        }else if (edadMax <= edadMin){
            System.out.println("La edad máxima y mínima es: " + edadMin);
        }else if (edadMax == 0 && edadMin == 100){
            System.out.println("Debe introducir al menos una edad");
        }else {
            System.out.println("La edad máxima es: " + edadMax);
            System.out.println("La edad mínima es: " + edadMin);
        }

        //Cerrar Scanner
        input.close();
    }
    
}
