/**
 * Clase Rectangulo
 * Calcula el area y perimetro de los rectangulos
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
*/
public class Rectangulo {
    //Atributos
    // Valor de la altura del rectangulo
    private double altura;
    //Valor de la base del rectangulo
    private double base;
    //Valor del area del rectangulo
    private double area;
    //Valor del perimetro del rectangulo
    private double perimetro;

    
    //Metodo constructor que representa las medidas de un rectangulo
     /** @param altura del rectangulo
     * @param base del rectangulo
     */
    public Rectangulo(){
        this.altura = 100;
        this.base = 10;
    }
    //Metodo constructor que representa las medidas de un rectangulo
    /**
     * @param altura del rectangulo
     * @param base del rectangulo
     */
    public Rectangulo(double altura, double base)//constructor
    {
        this.altura = altura;
        this.base = base;
    }
    /**
     * Metodo que regresa el valor de la base del ractangulo
     * @return base del rectangulo
     */
    public double getBase() {return base;}
    /**
     * Metodo que regresa el valor de la altura del ractangulo
     * @return altura del rectangulo
     */
    public double getAltura() {return altura;}
    //Metodo el valor de la base del rectangulo
       public void setBase(double base)
    {
        if (base > 0 && base < 30)
            this.base = base;
    }
    //Metodo que establece el valor de la altura del rectangulo
    public void setAltura(double altura)
    {
        if (altura > 0 && altura < 30)
        this.altura = altura;
    }
    /**
     * Metodo para regresar el area del rectangulo
     * @return area del rectangulo
     */
   
      public double getArea()
    {
        return base*altura;
    }
    /**
     * Metodo para regresar el perimetro del rectangulo
     * @return perimetro del rectangulo
     */
   
      public double  getPerimetro()
    {
        return 2 * (base + altura);
    }
    /**
     * Metodo que regresa el valor del perimetro y el area del rectangulo
     * @return perimetro y area del rectangulo 
    */ 
    public String toString() {
    return "El perimetro del rectangulo es:  " + perimetro  + " El area del rectangulo es:  " + area;
    }
}

