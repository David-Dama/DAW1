

import java.util.Scanner;

public class E2_clasico {
    public static void main(String[] args) {
        
        //Scanner y variables
        Scanner input = new Scanner(System.in);
        Character calificacion;
        
        //Solicitar calificacion
        System.out.print("Ingrese una calificación (A, B, C, D, F): ");
        calificacion = input.next().charAt(0);

        //Switch para interpretar calificacion
        switch (calificacion){
            case 'A':
                System.out.println("Sobresaliente");
                break;
            case 'B':
                System.out.println("Notable");
                break;
            case 'C':
                System.out.println("Bien");
                break;
            case 'D':
                System.out.println("Suficiente");
                break;
            case 'F':
                System.out.println("Suspendido");
                break;
            default:
                System.out.println("Calificación inválida. Por favor ingrese A, B, C, D o F.");
                break;
        }
        
        //Cerrar Scanner
        input.close();
    }
    
}
