package Programacion.JAVA.Ejercicios_Java.Unidad1.Ejercicios_Operadores_Ternarios;

import java.util.Scanner; //Importar Scanner

public class E8 {
    public static void main(String[] args) {

        //Escaner y declaración de variables
        Scanner input = new Scanner(System.in);
        double notaNumerica;
        String notaLetra;

        //Solicitud de información al usuario y guardado de información en la variable
        System.out.print("Ingresar valor numerico de la nota: ");
        notaNumerica = input.nextDouble();

        //Operadores ternarios
        notaLetra = (notaNumerica>=0 && notaNumerica<=10) ? 
            (notaNumerica>=9 && notaNumerica<=10) ? 
                "A" : (notaNumerica>=8 && notaNumerica<9) ?
                    "B" : (notaNumerica>=7 && notaNumerica<8) ?
                        "C" : (notaNumerica>=6 && notaNumerica<7) ?
                            "D" : "F":
        "La nota númerica debe ser igual o superior a 0 e igual o inferior a 10";

        //Impresión del resultado
        System.out.print(notaLetra);

        //Cerrar Scanner
        input.close();
    }
    
}
