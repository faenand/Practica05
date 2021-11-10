/**
 * Clase Ciclo While
 * Calcula los numeros primos del 2 al 1000 
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
*/
public class CicloWhile{
  /**
   * Metodo principal donde ejecutamos los ciclos para calcular
   * numeros primos
   * @param args Los argumentos
   * */
    public static void main(String args[]){
      //variable que imprime numeros enteros desde el valor inicial
      int x = 2;
      //variable que será verdadera si el entero es primo y falsa en caso contrario
      boolean primo = true;
      //En el while se imprimen los numeros que van desde el valor inicial hasta el valor 1000 y los guardamos en un arreglo
      while(x<1000){
          primo = true;
          	int y = 2;
          while (y<x){
              if(x%y==0 && x!=y){
                  primo = false;
                  break;
              }
              y=y+1;
              }
if (primo){
  //Imprimimos los valores que obtuvimos a traves del arreglo
      System.out.println(x);
    }
    x=x+1;
}
}
}