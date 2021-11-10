/**
 * Clase Cuenta
 * Calcula el dinero disponible en una cuenta
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
*/
public class Cuenta{
    //Atributos
    
    //Nombre del titular
    private String titular;
    //Dinero disponible en la cuenta 
    private double dineroDisponible;

    /**
     *Constructor que recibe 2 parametros: titular y dinero disponible
     * @param titular de la cuenta
     * @param dinero disponible en la cuenta */ 
    public Cuenta(){
	this.titular = "Talan";
	this.dineroDisponible = 100;
    }
    /**
     *Constructor que recibe 2 parametros
     * @param titular de la cuenta
     * @param dineroDisponible en la cuenta 
     */
    public Cuenta(String titular){
	this.titular = titular;
	this.dineroDisponible = dineroDisponible;
    }
    /**
     *Metodo para regresar el nombre del titular
     * @return titular de la cuenta  
    */
    public String getTitular(){
	return titular;
    }
    /**
     * Metodo que establece el nombre del titular de la cuenta
    *@param titular de la cuenta
    */
    public void setTitular(String titular){
	this.titular = titular;
    }
    /**
    *Metodo que regresa el dinero disponible en la cuenta
    * @return dinero disponible en la cuenta
    */
    public double getdineroDisponible(){
	return dineroDisponible;
    }
    /**
     * Metodo que establece la cantidad de dinero disponible en la cuenta
     * @param dineroDisponible en la cuenta
    */
    public void setdineroDisponible (double dineroDisponible){
	this.dineroDisponible = dineroDisponible;
    }
    
    /**
     * Metodo que regresa el nombre del titular de la cuenta y la cantidad de dinero disponible
     *@return regresa el titular de la cuenta y el dinero disponible 
    */
    public String toString() {
	return "El titular " + titular + " tiene " + dineroDisponible + " dinero disponible en la cuenta";
	    }
}
