/*Escribe un programa que valide un inicio de sesión. El programa debe solicitar 
un  nombre  de  usuario  (String)  y  una  contraseña  (String).  Implementa  los 
siguientes criterios para la validación: 
- Usuario  Válido:  El  nombre  de  usuario  NO  debe  ser  una  cadena  vacía  (ver 
método  .isEmpty()  de  String)  Y  debe  ser  igual  a  la  cadena  "Admin"  O  a  la 
cadena "UsuarioPrueba. 
- Contraseña  Segura:  La  contraseña  debe  tener  una  longitud  de  8  o  más 
caracteres  (ver  .length()  de  String)  Y  NO  debe  ser  igual  (ver  .equals()  de 
String) al nombre de usuario. 
El programa debe hacer las comprobaciones anteriores e imprimir: 
- “Inicio de Sesión Exitoso": Si el usuario es válido Y la contraseña es segura. 
- "Error: Credenciales Inválidas": Si el usuario es válido, pero la contraseña no 
es segura. 
- "Error: Usuario No Encontrado": Si el usuario no es válido. */

package Programacion.JAVA.Ejercicios_Java.Unidad2.Ejercicios_Condicionales2;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        
        //Importar Scanner y declarar variables
        Scanner input = new Scanner(System.in);
        String nombreUsuario, contrasena;
        boolean usuarioValido, contrasenaSegura;

        //Pedir datos al usuario
        System.out.print("Ingrese su Nombre de Usuario: ");
        nombreUsuario = input.nextLine();
        System.out.print("Ingrese su Contraseña: ");
        contrasena = input.nextLine();

        //Validar usuario
        if (nombreUsuario.isEmpty()) {
            usuarioValido = false;
        } else {
            usuarioValido = nombreUsuario.equals("Admin") || nombreUsuario.equals("UsuarioPrueba");
        }

        //Validar contraseña
        if (contrasena.length() < 8 || contrasena.equals(nombreUsuario)) {
            contrasenaSegura = false;
        } else {
            contrasenaSegura = true;
        }

        //Condicionales y resultados
        if (usuarioValido == true && contrasenaSegura == true){
            System.out.println("Inicio de Sesión Exitoso");
        } else if (usuarioValido == true && contrasenaSegura == false) {
            System.out.println("Error: Credenciales Inválidas");
        } else {
            System.out.println("Error: Usuario No Encontrado");
        }

        //Cerar Scanner
        input.close(); 
    }
}
