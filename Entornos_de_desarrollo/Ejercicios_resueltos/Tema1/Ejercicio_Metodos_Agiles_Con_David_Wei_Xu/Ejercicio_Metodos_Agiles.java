package Entornos_de_desarrollo.Ejercicios_resueltos.Tema1.Ejercicio_Metodos_Agiles_Con_David_Wei_Xu;

import java.util.Scanner;

public class Ejercicio_Metodos_Agiles {
    public static void main(String[] args) {
        
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        int numUser, numDice, attempt = 3, eleccion;

        //Eleccion de modo de juego
        System.out.print("Choose a game mode:    \n1. Roll the dice 3 times and guess the number each time, 1 attempt per roll  \n2. Roll the dice 1 time and guess the number (3 attempts)    \nYour choice: ");
        eleccion = input.nextInt();

        switch (eleccion) {
            case 1:
                //Salida de datos
                while (attempt>0){

                    //Entrada de datos
                    System.out.print("Guess the number between 1 and 6 (You have " + attempt + " attempts): ");
                    numUser = input.nextInt();
            
                    //Generacion de numero aleatorio
                    numDice = (int)(Math.random() * 1) + 1;
            
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
                }
                break;

            case 2:
                //Entrada de datos
                System.out.print("Guess the number between 1 and 6 (You have " + attempt + " attempts): ");
                numUser = input.nextInt();    
            
                //Generacion de numero aleatorio
                numDice = (int)(Math.random() * 6) + 1; 
                attempt--;

                //Salida de datos
                while (attempt>0){
                    
                    //Condicionales
                    if (numUser == numDice) {
                        System.out.println("Congratulations! You guessed the number " + numDice);
                        break;
                    } else {
                        System.out.print("Sorry, that was incorrect. Try again. You have " + attempt + " attempts left: ");
                        numUser = input.nextInt();
                        attempt--;
                    }
                if (attempt == 0){
                    System.out.println("You've used all your attempts. Better luck next time! The correct number was " + numDice);}

            }
                break;

            default:
                System.out.println("You must enter the number 1 or 2 to choose the game mode. Not other options are available.");
        }

        //Cierre del Scanner
        input.close();
    }
}
