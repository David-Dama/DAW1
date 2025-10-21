package Programacion.JAVA.Ejercicios_Java.Unidad_1.Ejercicios_Fundamentos_Java_1;

import java.util.Scanner; //Importar Scanner

public class E11 {
    public static void main(String[] args) {

        //Scanner y declaración de variables
        Scanner input = new Scanner(System.in);
        boolean llueve, tareas, biblioteca, salir;

        //Solicitar información al usuario y guardarla en las variables
        System.out.print("¿Está lloviendo? (Responder con 'true' o 'false')");
        llueve = input.nextBoolean();
        System.out.print("¿Has terminado las tareas? (Responder con 'true' o 'false')");
        tareas = input.nextBoolean();
        System.out.print("¿Vas a ir a la biblioteca? (Responder con 'true' o 'false')");
        biblioteca = input.nextBoolean();

        //Operaciones
        salir = ((llueve == false && tareas == true) || biblioteca == true);
        
        //Impresión del resultado
        System.out.print(salir);

        //Cerrar Scanner
        input.close();
    }
}
