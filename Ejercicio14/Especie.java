public class Especie {
public String nombreEnEspañol;
public String nombreCientifico;
public String descripcion;
public String clima;
 
public Especie(String nombreEnEspañol, String nombreCientifico, String descripcion, String clima) {
    this.nombreEnEspañol = nombreEnEspañol;
    this.nombreCientifico = nombreCientifico;
    this.descripcion = descripcion;
    this.clima = clima;
}
public String getNombreEnESpañol(){
    return this.nombreEnEspañol;
}
public void setNombre_En_Español(String nombreEnEspañol){
    this.nombreEnEspañol = nombreEnEspañol;
}
public String getNombreCientifico(){
    return this.nombreCientifico;
}
public void setNombreCientifico(String nombreCientifico){
    this.nombreCientifico = nombreCientifico;
}
public String getDescripcion(){
    return this.descripcion;
}
public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
}
public String getClima(){
    return this.clima;
}
public void setClima(String clima){
    this.clima = clima;
}
}

