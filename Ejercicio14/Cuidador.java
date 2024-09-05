public class Cuidador extends Empleado{
    public String genero;
    public int edad;
    public String area;
    
    public Cuidador( String nombre, String apellido, String cargo, Sring correo, String telefono, String id, String genero, int edad,  String area) {
        super(nombre, apellido, cargo, id, correo, telefono);
        this.genero = genero;
        this. edad = edad;
        this.area = area;      
}
public void setGenero(String genero){
    this.genero = genero;
}
public String getGenero(){
    return this.genero;
}
public void setEdad(int edad){
    this.edad = edad;
}
public int getEdad(){
    return this.edad;
}S
public String getArea(){
    return this.area;
} 
public void setArea(String area){
    this.area = area;
}

}
