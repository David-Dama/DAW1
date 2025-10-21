package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; //Importar Scanner

public class E3 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int numN, numM, resultado;

        //Solicitar y almacenar información
        System.out.print("Ingresar el dividendo: ");
        numN = input.nextInt();
        System.out.print("Ingresar divisor: ");
        numM = input.nextInt();

        //Operaciones y ternarios
        numM = (numM > 0) ? numM : -numM;
        resultado = (numN%numM == 0) ? 0 : (numN%numM > 0) ? (numM-numN%numM) : (-numM-numN%numM);

        //Imprimir resultado
        System.out.print(resultado);

        //Cerrar Scanner
        input.close();
    }
    
} 
