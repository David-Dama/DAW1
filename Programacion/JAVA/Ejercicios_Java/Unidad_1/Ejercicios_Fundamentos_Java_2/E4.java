package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; //Importamos el Scanner

public class E4 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        double areaTriangulo, baseTriangulo, alturaTriangulo;

        //Solicitud y guardado de datos
        System.out.print("Ingresar base del triangulo: ");
        baseTriangulo = input.nextInt();
        System.out.print("Ingresar altura del triangulo: ");
        alturaTriangulo = input.nextInt();

        //Operaciones
        areaTriangulo = ((baseTriangulo * alturaTriangulo)/2);

        //Imprimir resultado
        System.out.println(areaTriangulo);

        //Cerra Scanner
        input.close();
    }
    
}
