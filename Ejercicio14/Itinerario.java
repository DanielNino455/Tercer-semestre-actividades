public class Itinerario {
  private String codigoItinerario;
  public String duracionRecorrido;
  public int longitud;
  public int maximoVisitantes;
   
  public Itinerario(String codigoItinerario, String duracionRecorrido, int longitud, int maximoVisitantes){
    this.codigoItinerario = codigoItinerario;
    this.duracionRecorrido = duracionRecorrido;
    this.longitud = longitud; 
    this.maximoVisitantes = maximoVisitantes;
  }
  public String getCodigoItinerario(){
    return this.codigoItinerario;
  }
  public void setCodigoItinerario(String codigoItinerario){
    this.codigoItinerario = codigoItinerario;
  }
  public String getDuracionRecorrido(){
    return this.duracionRecorrido;
  }
  public void setDuracionRecorrido(String duracionRecorrido){
    this.duracionRecorrido = duracionRecorrido;
}
  public int getLongitud(){
  return this.longitud;
}
  public void setLongitud(int longitud){
  this.longitud = longitud;
}
public int getMaximoVisitantes(){
  return this.maximoVisitantes;
}
public void setMaximoVisitantes(int maximoVisitantes){
  this.maximoVisitantes = maximoVisitantes;
}
}