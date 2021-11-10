import java.util.Scanner;
/**
 * Clase Bisiesto
 * Calcula si un año es bisiesto o no
 @author Fernando Mendoza Eslava-319097690
 @version 1.0
*/
public class Bisiesto {
    /**
     * Metodo principal donde se determina si un año es bisiesto o no
     * @param args Los argumentos
     * */
    public static void main( String[] args ) {
    //variable que toma el valor de un año ingresado por el usuario
    int año;
    //Usamos un escaner para que el usuario digite el año del que desea saber si es bisiesto
    Scanner sc = new Scanner(System.in);
    
        System.out.println("***Bisiesto***");
        System.out.println("ingresa el año del que deseas saber si es bisiesto o no");
        año = sc.nextInt();
	//A traves de la condicional determinamos si el año ingresado es bisiesto o no, probando si es divisible entre 4, 100 o 400
        //si la condición se cumple se imprime que el año ingresado es bisiesto 
            if ( ( ( año % 4 == 0 ) && ( año % 100 != 0 ) ) || ( año % 400 == 0 ) ) {
            System.out.println( "El año " + año + " es bisiesto.");
            }
            //si la condición no se cumple, se imprime que el año ingresado no es bisiesto
            else {
            System.out.println( "El año " + año + " no es bisiesto.");
}      
}
}
