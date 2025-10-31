package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; //Importamos Scanner

public class E5 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int a, b, c, x, y;

        //Solicitud y almacenamiento de datos
        System.out.print("Ingresar el valor de 'a': ");
        a = input.nextInt();
        System.out.print("Ingresar el valor de 'b': ");
        b = input.nextInt();
        System.out.print("Ingresar el valor de 'c': ");
        c = input.nextInt();
        System.out.print("Ingresar el valor de 'x': ");
        x = input.nextInt();

        //Operaciones
        y = ((a*(x*x))+(b*x)+c);

        //Imprimir resultado
        System.out.println("y = " + y);

        //Cerrar Scanner
        input.close();
    }   
}
