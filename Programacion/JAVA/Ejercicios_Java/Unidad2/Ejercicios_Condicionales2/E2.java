/*Realiza  el  «juego  de  la  suma»  ,  que  consiste  en  que  aparezcan  dos  números 
enteros aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. 
La  aplicación  debe  indicar  si  el  resultado  de  la  operación  es  correcto  o 
incorrecto. */

package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Condicionales2;

import java.util.Scanner; 

public class E2 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num1, num2, sumaUsuario, sumaCorrecta;

        //Generación de números aleatorios
        num1 = (int)(Math.random() * 99) + 1;
        num2 = (int)(Math.random() * 99) + 1;

        //Salida de datos y entrada del usuario
        System.out.print("¿Cuánto es " + num1 + " + " + num2 + "? ");
        sumaUsuario = input.nextInt();
        sumaCorrecta = num1 + num2;

        //Comprobación y salida de resultados
        if (sumaUsuario == sumaCorrecta) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto. La respuesta correcta es " + sumaCorrecta + ".");
        
        //Cerrar Scanner
        input.close();
        }
    }
}
