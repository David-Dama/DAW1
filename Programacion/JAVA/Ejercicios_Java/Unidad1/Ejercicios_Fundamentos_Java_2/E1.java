package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; //Importar Scanner

public class E1 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        double precioBase, iva, precioIva, precioTotal;

        //Solicitud y almacenamiento de información
        System.out.print("Ingresar precio base del producto: ");
        precioBase = input.nextInt();
        System.out.print("Ingresar IVA (sin %): ");
        iva = input.nextDouble();

        //Operaciones
        precioIva = precioBase * (iva/100);
        precioTotal = precioBase + precioIva;
        
        //Imprimir resultado
        System.out.println(precioTotal);

        //Cerrar Scanner
        input.close();
    }
    
}
