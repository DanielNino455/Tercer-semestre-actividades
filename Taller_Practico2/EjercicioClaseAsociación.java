import java.util.ArrayList;
import java.util.List;


class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}


class Proyecto {
    private String nombre;

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Asignacion {
    private Empleado empleado;
    private Proyecto proyecto;

    public Asignacion(Empleado empleado, Proyecto proyecto) {
        this.empleado = empleado;
        this.proyecto = proyecto;
    }


    public void mostrarAsignacion() {
        System.out.println(empleado.getNombre() + " está asignado al proyecto " + proyecto.getNombre());
    }
}

public class EjercicioClaseAsociación {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Pedro");
        Empleado empleado2 = new Empleado("Tito");
        
        Proyecto proyecto1 = new Proyecto("Desarrollo Web");
        Proyecto proyecto2 = new Proyecto("Aplicación Móvil");
        
        List<Asignacion> asignaciones = new ArrayList<>();
        
        asignaciones.add(new Asignacion(empleado1, proyecto1));
        asignaciones.add(new Asignacion(empleado1, proyecto2));
        asignaciones.add(new Asignacion(empleado2, proyecto1));
        
        for (Asignacion asignacion : asignaciones) {
            asignacion.mostrarAsignacion();
        }
    }
}
