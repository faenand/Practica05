public class Cuenta{
    private String titular;
    private double dineroDisponible;

    //constructores
    public Cuenta(){
	this.titular = "Fernando";
	this.dineroDisponible = 100;
    }
    public Cuenta(String titular){
	this.titular = titular;
	this.dineroDisponible = 0;

    }
    //Metodos
    public String getTitular(){
	return titular;
    }
    public void setTitular(String titular){
	this.titular = titular;
    }
    public double getdineroDisponible(){
	return dineroDisponible;
    }
    public void setdineroDisponible (double dineroDisponible){
	this.dineroDisponible = dineroDisponible;
    }
    
    //Devuelve el estado del objeto
    public String toString() {
	return "El titular " + titular + " tiene " + dineroDisponible + " dinero disponible en la cuenta";
	    }
}
