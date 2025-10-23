/*Con el siguiente código se pretende solicitar al usuario un número entero 
para imprimirlo posteriormente por pantalla. Corrige el código y comenta las 
correcciones realizadas. 
 
public class Prueba{   
    public static void main(String() args){  
    Scanner miEscaner = new Scanner(System.in);  
    System.out.println("Introduce un número entero");     
    numEntradaInt = miEscaner.nextInt();  
    System.out.println("El número entero introducido es: "+numEntradaInt); 
    } 
} 
  */

package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Repaso;

import java.util.Scanner; //Importar la clase Scanner para poder usarla, cosa que falta el en código

public class E5 { //En este caso pongo E5 ya que es el nombre de mi archivo
    public static void main(String[] args) { //Corregido String() por String[]
        Scanner miEscaner = new Scanner(System.in); //Esta línea es correcta
        System.out.println("Introduce un número entero"); //Esta línea es correcta
        int numEntradaInt = miEscaner.nextInt(); //Falta declarar la variable numEntradaInt como tipo int
        System.out.println("El número entero introducido es: " + numEntradaInt); //Esta línea es correcta
        miEscaner.close(); //Faltaba cerrar el Scanner
    }  
}
