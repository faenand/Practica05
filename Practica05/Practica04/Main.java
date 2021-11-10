/**
 * Clase Main
 * Calcula el area y perimetro de un rectangulo 
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
*/
import java.util.Scanner;
public class Main {
	/**
     * Metodo principal donde se determina el area y perimetro de un rectangulo
     * @param args Los argumentos
     * */

    public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Rectangulo Rectangulos = new Rectangulo ();
	     //Se muestra el valor de la base ingresado por el usuario
	    System.out.println("Base: " + Rectangulos.getBase());
	    //Se muestra el valor de la altura ingresado por el usuario
	    System.out.println("Altura: " + Rectangulos.getAltura());
	    //Mostramos el valor del area del rectangulo rectangulos 
	    System.out.println("Area: " + Rectangulos.getArea());
	    //Mostramos el valor del perimetro del rectangulo rectangulos
	    System.out.println("Perimetro: " + Rectangulos.getPerimetro());

	Rectangulo Rectangulos2 = new Rectangulo ();
		//Se muestra el valor de la base ingresado por el usuario	
		System.out.println("ingrese el valor de la base del rectangulo");
		double base = sc.nextDouble();
		//Se muestra el valor de la altura ingresado por el usuario
        System.out.println ("Ingrese el valor de la altura del rectángulo");
		double altura = sc.nextDouble();
		//Mostramos el valor del area del rectangulo rectangulos2
	 	System.out.println("Area: " + Rectangulos2.getArea());
	 	//Mostramos el valor del perimetro del rectangulo rectangulos2
	    System.out.println("Perimetro: " + Rectangulos2.getPerimetro());

    }
    }


