package Programacion.JAVA.Ejercicios_Explicaciones;

public class PruebaFunciones {

    public static void main(String[] args) {
        boolean pruebaVariable = miSaludo("pepe", 4);
        System.out.println((pruebaVariable));//vale true
        if(miSaludo("paco",2)){
            System.out.println("Todo ha ido bien");
        }
    }

    public static boolean miSaludo(String cadena, int longi){
        System.out.println("¡HOLAAAA " + cadena + " desde mi función!");
        boolean resultado;
        if (cadena.length() < longi){
            resultado = false;
        } else {
            resultado = true;
        }
        return resultado; //Un único punto de retorno en la función!!!
    }   
}

/*EXPLICACIONES:
 * Si no va a retornar nada se pone void, si en donde iría el void pone alguna clase o variable, significia que deberá devolver algo de esa variable o clase
 * 
 * Lo de String cadena que está dentro de la función miSaludo significa que hay que introducir un parámetro de la clase string en ese caso que se guardará en 
 * una variable llamada cadena
 * 
 * erf
 */