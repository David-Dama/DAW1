/*En una granja se compra diariamente una cantidad (comidaDiaria) de comida 
para los animales. El número  de animales que alimentar (todos de la misma 
especie)  es  numAnimales, y  sabemos  que cada  animal  come  una media  de 
kilosPorAnimal. Diseña un programa que solicite al usuario los valores 
anteriores y determine si disponemos de alimento suficiente para cada animal. 
En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno 
de los animales. 
Nota:  Evitar que la aplicación realice divisiones por cero. */

package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Condicionales2;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        double comidaDiaria, kilosPorAnimal, racionNecesariaPorAnimal, racionPorAnimal;
        int numAnimales;

        //Entrada de datos
        System.out.print("Introduce la cantidad diaria de comida disponible (en kg): ");
        comidaDiaria = input.nextDouble();
        System.out.print("Introduce el número de animales: ");
        numAnimales = input.nextInt();
        System.out.print("Introduce la cantidad de comida que come cada animal (en kg): ");
        kilosPorAnimal = input.nextDouble();
    
        //Cálculo y salida de resultados con condicionales
        racionNecesariaPorAnimal = (numAnimales * kilosPorAnimal) / comidaDiaria;
        racionPorAnimal = comidaDiaria / (numAnimales * kilosPorAnimal);
        if (numAnimales == 0) {
            System.out.println("El número de animales no puede ser cero.");
        }else if (comidaDiaria >= kilosPorAnimal * numAnimales) {
            System.out.println("Hay comida suficiente para cada animal."); 
        } else {
            System.out.println("No hay comida suficiente para cada animal, la ración por animal necesaria es de: " + racionNecesariaPorAnimal + " kg.");
            System.out.println("La ración por animal disponible es de: " + racionPorAnimal + " kg.");
        }
        

        //Cerrar Scanner
        input.close();
    }  
}