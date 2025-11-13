package Ejercicios_Java.Unidad2.Funciones;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        //Scanner y declaracion de variables
        Scanner input = new Scanner(System.in);
        double valorFactura, impuestoFactura, totalCalculado;
        char tipoImpuesto;

        //Entrada de datos
        System.out.print("Introduzca el valor de la factura sin impuestos aplicados: ");
        valorFactura = input.nextDouble();
        System.out.print("Introduzca los impuestos a aplicar: ");
        impuestoFactura = input.nextDouble();
        System.out.print("El impuesto se deduce o se añade? D/I: ");
        tipoImpuesto = input.next().charAt(0);
    
        //Darle el valor de la funcion calcularTotal a una variable
        totalCalculado = calcularTotal(valorFactura, impuestoFactura, tipoImpuesto);

        //Salida de datos
        if (totalCalculado != -999){
        System.out.printf("El precio total de la factura es: %.2f", totalCalculado);
        } else {
            System.out.println("Los datos para el cálculo son incorrectos");
        }
        
        //Cerrar Scanner
        input.close();
    }

    public static double calcularTotal(double valorTotal, double impuestos, char tipo){
        double sumatorio;
        if (tipo == 'I' || tipo == 'i') {
            sumatorio = valorTotal * (1+impuestos/100);
        } else if (tipo == 'D' || tipo == 'd') {
            sumatorio = valorTotal * (1-impuestos/100);
        } else {
            sumatorio = -999;
        }
        return sumatorio;
    }
}
//TODO 