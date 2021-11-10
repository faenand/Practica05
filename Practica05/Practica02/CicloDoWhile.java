/**
 * Clase Ciclo While
 * Calcula los numeros primos del 2 al 1000 
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
*/
public class CicloDoWhile {
   /**
   * Metodo principal donde ejecutamos los ciclos para calcular
   * numeros primos
   * @param args Los argumentos
   * */
    public static void main(String args[]) {
      //variable que imprime numeros primos desde el valor inicial
      int x = 2;
      //variable que será verdadera si el entero es primo y falsa en caso contrario
      boolean primo = true;
      //en el do while se imprimen los numeros que van desde el valor inicial hasta el valor limite y los guardamos en un arreglo
      do{
          primo = true;
          int y= 2;
          do{
              if(x%y == 0 && x!=y){
                  primo = false;
                    break;
              }
              y = y + 1;
          }while(y <= x);

          if (primo){
              //Imprimimos los valores que obtuvimos a traves del arreglo
              System.out.println(x);
          }
          x = x + 1;
      }while(x<1000);
}
}