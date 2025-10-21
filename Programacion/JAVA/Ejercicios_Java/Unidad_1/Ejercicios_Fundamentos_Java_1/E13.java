package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E13 {
    public static void main(String[] args) {

        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int trimestre1, trimestre2, trimestre3;

        //Solicitar información al usuario y guardarla en las variables correspondientes
        System.out.print("Ingresar nota del trimestre 1: ");
        trimestre1 = input.nextInt();
        System.out.print("Ingresar nota del trimestre 2: ");
        trimestre2 = input.nextInt();
        System.out.print("Ingresar nota del trimestre 3: ");
        trimestre3 = input.nextInt();

        //Operaciones, casteo e impresión de los resultados
        System.out.println("La media con números enteros de los tres trimestres es " + ((trimestre1 + trimestre2 + trimestre3)/3));
        System.out.print("La media con decimales de los tres trimestres es " + ((double)(trimestre1 + trimestre2 + trimestre3)/3));
        
        //Cerrar Scanner
        input.close();
    }
}
