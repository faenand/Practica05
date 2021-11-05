/*
Fernando Mendoza Eslava
319097690
*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Rectangulo Rectangulos = new Rectangulo ();
	     
	    System.out.println("Base: " + Rectangulos.getBase());
	    System.out.println("Altura: " + Rectangulos.getAltura());
	    System.out.println("Area: " + Rectangulos.getArea());
	    System.out.println("Perimetro: " + Rectangulos.getPerimetro());

	Rectangulo Rectangulos2 = new Rectangulo ();
	System.out.println("ingrese el valor de la base del rectangulo");
	double base = sc.nextDouble();
        System.out.println ("Ingrese el valor de la altura del rectángulo");
	double altura = sc.nextDouble();
	 System.out.println("Area: " + Rectangulos2.getArea());
	    System.out.println("Perimetro: " + Rectangulos2.getPerimetro());

    }
    }


