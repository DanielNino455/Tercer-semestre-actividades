public class Habitad {
    public String nombre;  
    public int clima;
    public String vegetacionPredominante;
    public String continente;


public Habitad(String nombre, int clima, String vegetacionPredominante, String continente){
   this.nombre = nombre;
   this.clima = clima;
   this.vegetacionPredominante = vegetacionPredominante;
   this.continente = continente;
}
public String getNombre(){
    return this.nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public  int getClima(){
    return this.clima;
}
public void setClima(int clima){
    this.clima = clima;
}
public String getVegetacionPredominante(){
    return this.vegetacionPredominante;
}
public void setVegetacionPredominante(String vegetacionPredominante){
    this.vegetacionPredominante = vegetacionPredominante;
}
public String getContinente(){
    return this.continente;
}
public void setContinente(String continente){
    this.continente = continente;
}
}


























