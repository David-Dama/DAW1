package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E8 {
    public static void main(String[] args) {

        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int edad;
        boolean mayorEdad;

        //Solicitar información al usuario y guardarla en la variable
        System.out.print("Ingresar edad: ");
        edad = input.nextInt();

        //Operaciones
        mayorEdad = (edad>=18);

        //Impresión resultado
        System.out.print("Mayor de edad: " + mayorEdad);

        //Cerrar Scanner
        input.close();
    }
    
}
