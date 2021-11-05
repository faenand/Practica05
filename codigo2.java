import java.util.Scanner;
public class CicloWhile{
    public static void main(String args[]) {
	System.out.println("---Programa que calcula numeros primos---");//se le da la bienvenida al usuario
      
      Scanner entrada1 = new
      Scanner (System.in);
      System.out.println("Introduzca el valor inicial: ");
      int a = entrada1.nextInt();//se define el valor de la variable inicial según el numero entero ingresado por el usuario
        
        Scanner entrada2 = new
        Scanner(System.in);
        System.out.print("Introduzca en valor final: ");
        int b = entrada2.nextInt();//se define el valor de la variable final según el numero entero ingresado por el usuario        
        int c;
        boolean esPrimo;
        
        if(a>b)//el programa pregunta si la variable inicial tiene un valor mayor a la final, si es el caso marca un error, si no es el caso pasa a ejecutar el condicional else
        {
            System.out.println("Error de entrada.");
        }
        else
        {
            while(a<=b)//el programa pregunta si la variable inicial es menor o igual que la final
            {
                c=2;
                esPrimo=true;
                while (c<a)
                {
                    if(a%c==0)
                    {
                        if(a%c==0)
                        {
                            esPrimo=false;
			    }
                        c++;
                    }
                    if(esPrimo)
                    {
                        System.out.println(a);
                    }
                            a++;
                            esPrimo=true;
                    }
                }
            }
    }
}
