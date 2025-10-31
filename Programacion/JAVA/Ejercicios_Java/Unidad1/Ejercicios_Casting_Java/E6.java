package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Casting_Java;

public class E6 {
    public static void main(String[] args) {
        
        //Declaración de variables
        float num1 = 1.5f;
        byte num2;

        //Casteo
        num2 = (byte)num1;

        //Impresión del resultado
        System.out.println("Valor original del float: " + num1);
        System.out.println("valor convertido: " + num2);
        System.out.println("Podemos observar que hemos perdido los decimales pero la parte enetera se conserva.");
    }
    
}
