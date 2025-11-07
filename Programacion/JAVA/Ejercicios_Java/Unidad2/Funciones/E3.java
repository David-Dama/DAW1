package Programacion.JAVA.Ejercicios_Java.Unidad2.Funciones;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        double valorFactura, impuestoFactura;
        char tipoImpuesto;

        //Entrada de datos
        System.out.print("Introduzca el valor de la factura sin impuestos aplicados: ");
        valorFactura = input.nextDouble();
        System.out.print("Introduzca los impuestos a aplicar: ");
        impuestoFactura = input.nextDouble();
        System.out.print("El impuesto se deduce o se añade? D/I");
        
    
        //Salida de datos
        System.out.printf("El precio total de la factura es: %.2f", calcularTotal(valorFactura, impuestoFactura));

        //Cerrar Scanner
        input.close();
    }

    public static double calcularTotal(double valorTotal, double impuestos, char tipo){
        double sumatorio;
        sumatorio = valorTotal * (1+impuestos/100);
        return sumatorio;
    }
}
//TODO 