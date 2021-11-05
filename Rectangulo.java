/*
Fernando Mendoza Eslava
319097690
*/
public class Rectangulo {

    private double altura;
    private double base;
    private double area;
        private double perimetro;

    
    //constructores
    public Rectangulo(){
        this.altura = 100;
        this.base = 10;
    }
    public Rectangulo(double altura, double base)//constructor
    {
        this.altura = altura;
        this.base = base;
    }
   
    public double getBase() {return base;}
    public double getAltura() {return altura;}
   
       public void setBase(double base)
    {
        if (base > 0 && base < 30)
            this.base = base;
    }
    public void setAltura(double altura)
    {
        if (altura > 0 && altura < 30)
        this.altura = altura;
    }
   
      public double getArea()
    {
        return base*altura;
    }
   
      public double  getPerimetro()
    {
        return 2 * (base + altura);
    }
    //Devuelve el estado del objeto
    public String toString() {
    return "El perimetro del rectangulo es:  " + perimetro  + " El area del rectangulo es:  " + area;
    }
}

