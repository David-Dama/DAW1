package Entornos_de_desarrollo.Ejercicios_resueltos;

import java.util.Scanner;

public class Ejercicio_Metodos_Agiles {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int numUser, numDice, attempt = 3;

        //Salida de datos
        while (attempt>0){

            //Entrada de datos
            System.out.print("Guess the number between 1 and 6 (You have 3 attempts): ");
            numUser = input.nextInt();
            
            //Generacion de numero aleatorio
            numDice = (int)(Math.random() * 6) + 1;
            
            if (numUser == numDice) {
                System.out.println("Congratulations! You guessed the number " + numDice);
                break;
            } else {
                System.out.println("Sorry, the correct number was " + numDice);
                attempt--;
            }
        }
        if (attempt == 0){
            System.out.println("You've used all your attempts. Better luck next time!");{
        }

        //Cerrar scanner
        input.close();
        
        }
    }
}
