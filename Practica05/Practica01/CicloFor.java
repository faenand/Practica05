/**
* Clase CicloFor
* Imprime los numero primos del 0 al 1000 y calcula cuantos son
*@author Fernando Mendoza Eslava-319097690
*@version 1.0
*/
import java.util.Scanner;

public class CicloFor {
	/**
     * Metodo principal donde se determina si un año es bisiesto o no
     * @param args Los argumentos
     * */
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //el valor inicial de los enteros que van a imprimirse
      int inicio=0;
      //el valor limite de los enteros que van a imprimirse
      int fin=1000;
      //el valor desde donde se van a contar los numeros primos 
      int contador = 0;
            //en el for se imprimen los numeros que van desde el valor inicial hasta el valor limite y los guardamos en un arreglo
	for (int x = inicio; x <= fin; x++) {
	if (esPrimo(x)) {
	contador++;
	 //Imprimimos los valores que obtuvimos a traves del arreglo
	System.out.print(String.valueOf(x) + ",");
	}
	}
	System.out.printf("\nTotal: %d", contador);
	sc.close();
	}
	public static boolean esPrimo(int numero) {
	    //tome los valores 0, 1 y 4 ya que no son numeros primos
	   if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			// Si un numero es divisible por cualquiera de estos números, no es primo
			if (numero % x == 0)
				return false;
		}
		// Si no se puede dividir por ninguno de esos numeros es primo
		return true;
	}
}
