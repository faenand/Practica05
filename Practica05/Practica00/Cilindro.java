/**
 *Clase Cilindro
 *Calcula del area y volumen de un cilindro 
 *@author Fernando Mendoza Eslava - 319097690
 *@version 1.0
 */
import java.util.Scanner;

public class Cilindro {
     /**
      * Metodo principal para calcular el area y volumen del cilindro
      * @param args Los argumentos
      * */
     public static void main(String args[]) {
	    //el radio de un cilindro con valor 10
         int r=10;
         //la altura de un cilindro con valor 20
         int h=20;
         //el numero π tomando los decimales 3.1416
	    double pi=3.1416;
         //utilizamos un escaner para mostrar al usuario el area y volumen del cilindro
	Scanner sc = new Scanner(System.in);
        
        System.out.println("***Programa para realizar el calculo del area de un cilindro***");
      //Calculamos e imprimimos el área del cilindro usando la formula: 2*pi * radio* (radio+altura) 

        System.out.println ("El área del cilindro es: " + 2*pi * r* (r+h) + " cm^2");

      //Calculamos e imprmimos el volumen del cilindro usando la formula: pi*(radio*radio)*altura  
        
        System.out.println ("El volumen del cilindro es: " + pi*(r*r)*h + " cm^3"); 
                
     }
     }
