package Programacion.JAVA.Ejercicios_Java.Ejercicios_Explicaciones;
import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Introduce las siglas del ciclo(DAM, DAW, ASIR):");
    String siglas = input.nextLine();
    
    switch (siglas) {
        case "DAM":
            System.out.println("Desarrollo de Aplicaciones Multiplataforma");
            break;
        case "DAW":
            System.out.println("Desarrollo de Aplicaciones Web");
            break;
        case "ASIR":
            System.out.println("Administración de Sistemas Informáticos en Red");
            break;
        case "SMR":
            System.out.println("Sistemas Microinformáticos y Redes");
            break;
        default:
            System.out.println("Ciclo no reconocido");
            break;
        }
        
        input.close();
    }
}   
