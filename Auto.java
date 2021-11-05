//constructor por omision
public Auto(){
    this.color = "blanco";
    this.n_puertas = 4;
    this.modelo = "tsuru";
}
//Constructor con parametros
public Auto(String color, int n_puertas, Sting modelo){
    this.color = color;
    this.n_puertas = n_puertas;
    this.modelo = modelo;
}
//metodos especiales
public String getColor(){
    return this.color;
}
public void setColor(String color){
    this.color = color;
    }
//metods de comportamiento
public String toString(){
    return "Color: " + this.color + "\n" + "#Puertas" + this.n_puertas + "\n" + "Modelo: " + this.modelo;
}
}
