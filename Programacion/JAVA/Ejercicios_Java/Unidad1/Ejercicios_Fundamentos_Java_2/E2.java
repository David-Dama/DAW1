package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Fundamentos_Java_2;

import java.util.Scanner; //Importar Scanner

public class E2 {
    public static void main(String[] args) {
        
        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        int num1;
        String resultado;

        //Solicitar y almacenar información
        System.out.print("Ingresar un número entero: ");
        num1 = input.nextInt();

        //Operaciones
        resultado = (num1%7 == 0) ?
            "Es múltiplo de 7" : (num1%7 == 1) ?
                "Hay que sumarle 6 para que sea múltiplo" : (num1%7 == 2) ?
                    "Hay que sumarle 5 para que sea múltiplo" : (num1%7 == 3) ?
                        "Hay que sumarle 4 para que sea múltiplo" : (num1%7 == 4) ?
                            "Hay que sumarle 3 para que sea múltiplo" : (num1%7 == 5) ?
                                "Hay que sumarle 2 para que sea múltiplo" : "Hay que sumarle 1 para que se múltiplo";

        //Imprimir resultado
        System.out.print(resultado);

        //Cerrar Scanner
        input.close();
    }
    
}
