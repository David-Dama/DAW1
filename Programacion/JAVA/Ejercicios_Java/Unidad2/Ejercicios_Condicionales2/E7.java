/*Escribe un programa que evalúe si una persona es elegible para un préstamo, 
basándose en dos variables de entrada:  
- el Salario Anual (un número real) y  
- la Antigüedad Laboral en años (un número entero).  
Y en las siguientes reglas: 
- Elegible:  Si  el  Salario  Anual  es  mayor  o  igual  a  30.000  euros  Y  tiene  una 
Antigüedad Laboral de 5 años o más. 
- Revisión  Especial:  Si  el  Salario  Anual  es  menor  a  30.000  euros  pero  la 
Antigüedad Laboral es de 10 años o más. 
- No Elegible: En cualquier otro caso. 
El  programa  debe  imprimir,  dependiendo  de  qué  reglas  de  las  anteriores  se 
cumplan:  "Préstamo  Aprobado", "Revisión  Especial  Requerida"  o "Préstamo 
Denegado" */

package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Condicionales2;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        
        //Importar Scanner y declarar variables
        Scanner input = new Scanner(System.in);
        double salarioAnual;
        int antiguedadLaboral;

        //Pedir datos al usuario
        System.out.print("Ingrese su Salario Anual en euros: ");
        salarioAnual = input. nextDouble();
        System.out.print("Ingrese su Antigüedad Laboral en años: ");
        antiguedadLaboral = input.nextInt();

        //Operaciones y condicionales
        if (salarioAnual >= 30000 && antiguedadLaboral >= 5) {
            System.out.println("Préstamo Aprobado");
        } else if (salarioAnual < 30000 && antiguedadLaboral >= 10) {
            System.out.println("Revisión Especial Requerida");
        } else {
            System.out.println("Préstamo Denegado");
        }

        //Cerrar Scanner
        input.close();
    }
}
