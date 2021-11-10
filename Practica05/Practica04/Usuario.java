/**
 * Clase Usuario
 * Calcula el dinero disponible en una cuenta 
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
*/
public class Usuario {
	/**
     * Metodo principal donde se determina el usuario y el dinero disponible en una cuenta
     * @param args Los argumentos
     * */
    public static void main (String [] args) {
	
	Cuenta cuenta_1 = new Cuenta ();
	
	//Mostramos el nombre del titular de la cuenta 1
	System.out.println("Usuario " + cuenta_1.getTitular());
	//Mostramos el dinero disponible en la cuenta 1
	System.out.println("Dinero " + cuenta_1.getdineroDisponible());

	Cuenta cuenta_2 = new Cuenta("Fernando");
	//Mostramos el titular de la cuenta 2
	System.out.println("Usuario " + cuenta_2.getTitular());
	//Mostramos el dinero disponible e la cuenta 2 
	System.out.println("Dinero " + cuenta_2.getdineroDisponible());
    }
}
	
