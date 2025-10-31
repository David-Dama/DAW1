/*Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y 
muestre el equivalente en radianes.  
- Si el ángulo introducido por el usuario no se encuentra en el rango de 0° a 
360°, hay que transformarlo a dicho rango. Utiliza el operador módulo para 
convertir un ángulo (> 360) a su equivalente en el rango comprendido de 0° 
a 360° 
- Para convertir de grados a radianes ten en cuenta esta relación:  
radianes = grados * PI/180 */

package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Condicionales2;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        
        //Importar Scanner y declarar variables
        Scanner input = new Scanner(System.in);
        double grados, radianes;

        //Solicitar datos al usuario
        System.out.print("Introduce el ángulo en grados: ");
        grados = input.nextDouble();

        //Calculo y salida de datos + condicionales
        if (grados < 0) {
            System.out.println("El ángulo no puede ser negativo.");
        }else{
            grados %= 360;
            radianes = (grados * Math.PI) / 180;
            System.out.println("El ángulo en radianes es: " + radianes);
        }

        //Cerrar Scanner
        input.close();
    }
}
