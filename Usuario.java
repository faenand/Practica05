public class Usuario {
    
    public static void main (String[]args) {
	
	Cuenta cuenta_1 = new Cuenta ();
	
	System.out.println("Usuario " + cuenta_1.getTitular());
	System.out.println("Dinero " + cuenta_1.getdineroDisponible());

	Cuenta cuenta_2 = new Cuenta("Fernando");
		System.out.println("Usuario " + cuenta_2.getTitular());
	System.out.println("Dinero " + cuenta_2.getdineroDisponible());
    }
}
	
