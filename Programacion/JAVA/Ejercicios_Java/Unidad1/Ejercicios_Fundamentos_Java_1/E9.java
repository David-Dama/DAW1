package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E9 {
    public static void main(String[] args) {

        //Scanmer u declaración de variables
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;
        double radio;

        //Solicitar información al usuario y guardar en la variable
        System.out.print("Ingresar radio: ");
        radio = input.nextDouble();

        //Operaciones e impresión del resultado
        System.out.println("La longitud de la cicunferencia es: " + ((2 * PI) * radio));
        System.out.print("El area de la circunferencia es: " + (PI * (radio * radio)));

        //Cerrar Scanner
        input.close();
    }
}
