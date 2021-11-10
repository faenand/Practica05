/**
 * Clase Condicionales
 * Calcula si un numero es mayor que otro
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
 */
import java.util.Scanner;

public class Condicionales {
   /**
   * Metodo principal donde ejecutamos los ciclos para calcular el numero con mayor valor
   * @param args Los argumentos
   * */
    public static void main(String[] args) {

        //Usamos un escaner para mostrar al usuario cual es el numero con mayor valor de los dos que ingreso 
        Scanner sc = new Scanner(System.in);
        System.out.println("***Condicionales*** ");
        //dos numeros ingresados por el usuario
        int n1, n2;
        System.out.print("Dame el número 1: ");
        n1 = sc.nextInt();
        System.out.print("Dame el número 2: ");
        n2 = sc.nextInt();
        //condicional que imprime el numero de mayor valor, sea el primero o el segundo
        if (n1 > n2) {
                System.out.println("El numero con mayor valor es: " + n1);                                             
            } else {
                System.out.println("El numero con mayor valor es: " + n2);     
}
}
}
