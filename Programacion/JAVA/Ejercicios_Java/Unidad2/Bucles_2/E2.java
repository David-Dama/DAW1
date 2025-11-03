package Programacion.JAVA.Ejercicios_Java.Unidad2.Bucles_2;

public class E2 {
    public static void main(String[] args) {
        
        //Bucle
        for (int i = 10; i != 0; i--) { //Que se repita 10 veces
            int multiplicando = i, multiplicador = 1;
            System.out.println("\nTabla de multiplicar del " + multiplicando + ":");
            while (multiplicador <= 10) {
                System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
                multiplicador++;
            }
        }
    }
}
