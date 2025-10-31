package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importar Scanner

public class E2 {
    public static void main(String[] args) {

        //Escaner y declaracióm de variables
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        String numeroMenor;

        //Solicitud de información al usuario y guardarla en las variables correspondientes
        System.out.print("Ingrese el primero número: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();
        System.out.print("Ingrese el tercer número: ");
        num3 = input.nextInt();

        //Operador ternario
        numeroMenor = (num1 < num2) ?
            num1 < num3 ?
                "El número " + num1 + " es el más pequeño" : "El número " + num3 + " es el más pequeño" : 
            num2 > num3 ? 
                "El número " + num3 + " es el más pequeño" : "El número " + num2 + " es el más pequeño";
        
        //Imprimisión del resultado
        System.out.print(numeroMenor);

        //Cerrar Scanner
        input.close();
    }

}
