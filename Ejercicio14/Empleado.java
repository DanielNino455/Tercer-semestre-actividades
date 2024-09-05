public class Empleado {
    protected String nombre;
    protected String apellido;
    protected String  cargo;
    protected String id;
    protected String correo;
    protected String telefono;

    public Empleado(String nombre, String apellido, String cargo, String id, String correo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this. id = id;
        this.correo = correo;
        this.telefono = telefono;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public String getNombre(){
    return this.nombre;
}
public void setApellido(String apellido){
    this.apellido = apellido;
}
public String getApellido(){
    return this.apellido;
}
public String getCargo(){
    return this.cargo;
}
public void setCargo(String cargo){
    this.cargo = cargo;
} 
public String getId(){
    return this.id;

}
public void setId(String id){
    this.id = id;
}
public String getCorreo(){
    return this.correo;
}
public void setCorreo(String correo){
    this.correo = correo;

}
public String getTelefono(){
    return this.telefono;
}
public void setTelefono(String telefono){
 this.telefono = telefono;
}
}




























































































