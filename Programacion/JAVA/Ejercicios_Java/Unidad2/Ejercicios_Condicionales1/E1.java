package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Condicionales1;

import java.util.Scanner; //Importar Scanner

public class E1 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int pizza, resultado;
        String socio;

        //Solicitud y almacenamiento de información
        System.out.print("Cuantas pizzas quiere comprar: ");
        pizza = input.nextInt();
        System.out.print("Eres socio? (S/N): ");
        socio = input.next();

        //Operaciones
        resultado = (pizza * 9);

        //Condicionales
        if (socio.equalsIgnoreCase("S")) {
            resultado = (resultado-3);
        }

        //Impresión del resultado
        System.out.print("El precio es: " + resultado);

        //Cerrar Scanner
        input.close();
    }
    
}
