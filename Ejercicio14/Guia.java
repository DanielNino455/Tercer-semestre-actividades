public class Guia extends Empleado {
    private String direccion;
    private String fechaIngreso;
        
        public Guia( String nombre, String apellido, String cargo, String id, String correo, String telefono, String direccion, String fechaIngreso) {
        super(nombre, apellido, cargo, id, correo, telefono);
        this.direccion = direccion;
        this.fechaIngreso = fechaIngreso;
    } 
    public String getDireccion(){
        return this.direccion;
}
public void setDireccion(String direccion){
    this.direccion = direccion;
}
public String getFechaIngreso(){
    return this.fechaIngreso;
}
public void setFechaIngreso(String fechaIngreso){
    this.fechaIngreso = fechaIngreso;
}
}