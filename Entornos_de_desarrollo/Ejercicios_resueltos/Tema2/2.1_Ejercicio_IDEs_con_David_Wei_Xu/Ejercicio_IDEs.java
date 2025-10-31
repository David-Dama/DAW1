

import java.util.Random;

public class Ejercicio_IDEs {
        public static void main(String[] args) {


            // Creación de arrays con datos predefinidos
            String[] nombres = {"Alex", "Sam", "Lucía", "Diego", "Marta", "Jules"};
            String[] lugares = {"en la biblioteca", "en el laboratorio", "en clase de programación", "en la cafetería"};
            String[] acciones = {
                    "rompió el código justo antes de entregarlo",
                    "olvidó hacer el commit en GitHub",
                    "descubrió un bug a las 3 de la mañana",
                    "logró compilar a la primera (milagro)",
                    "confundió Python con Java durante el examen",
            };

            // Create a Random object
            Random random = new Random();

            // Generate a random index
            int randomNombre = random.nextInt(nombres.length);
            int randomLugar = random.nextInt(lugares.length);
            int randomAccion = random.nextInt(acciones.length);

            // Generación de situaciones de estudiantes de informática
            System.out.println("Generador de situaciones de estudiantes de informática ");
            String nombre = nombres[randomNombre];
            String lugar = lugares[randomLugar];
            String accion = acciones[randomAccion];
            System.out.printf("%s estaba %s y %s.", nombre, lugar, accion);
        }
    }