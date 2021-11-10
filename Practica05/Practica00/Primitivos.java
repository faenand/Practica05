/**
 * Clase Primitivos
 * Imprime el numero de bytes que ocupan los diferentes tipos primitivos
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
 * */
public class Primitivos {
	/**
      * Metodo principal para calcular el espacio que ocupan los diferentes tipos primitivos
      * @param args Los argumentos
      * */
     public static void main(String[] args){
	 System.out.println ("***Tipos primitivos***");
	 //se muestra el espacio que ocupan los datos del tipo boolean
	 System.out.println ("El tipo primitivo Boolean ocupa: 1 byte" );
	 //se muestra el espacio que ocupan los datos del tipo byte
      System.out.println ("Byte: " + Byte.BYTES + " bytes");
      //se muestra el espacio que ocupan los datos del tipo short
	 System.out.println ("Short: " + Short.BYTES + " bytes");
	 //se muestra el espacio que ocupan los datos del tipo char
	 System.out.println ("Character: " + Character.BYTES + " bytes"); 
	 //se muestra el espacio que ocupan los datos del tipo int
	 System.out.println ("Interger: " + Integer.BYTES + " bytes");
	 //se muestra el espacio que ocupan los datos del tipo long
	 System.out.println ("Long: " + Long.BYTES + " bytes");
	 //se muestra el espacio que ocupan los datos del tipo float
	 System.out.println ("Float: " + Float.BYTES + " bytes");
	 //se muestra el espacio que ocupan los datos del tipo double
	 System.out.println ("Double: " + Double.BYTES + " bytes");
     }
     }
