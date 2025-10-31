package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Casting_Java;

public class E10 {
    public static void main(String[] args) {
        
        //Declaración de variables
        int num1 = 5;
        short num2; 

        //Casteo
        num2 = (short)num1;
        num1 = num2;

        //Impresión de resultados
        System.out.println(num1);
        System.out.println(num2);
    }
    
}
