import java.util.ArrayList;
import java.util.List;


class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}


class Aula {
    private List<Estudiante> estudiantes;

    public Aula(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void iniciarClase() {
        System.out.println("Estudiantes en el aula:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante.getNombre());
        }
    }
}

public class EjercicioAgregacion {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Daniel");
        Estudiante estudiante2 = new Estudiante("Roberto");
        Estudiante estudiante3 = new Estudiante("juan");

        List<Estudiante> listaDeEstudiantes = new ArrayList<>();
        listaDeEstudiantes.add(estudiante1);
        listaDeEstudiantes.add(estudiante2);
        listaDeEstudiantes.add(estudiante3);

        Aula miAula = new Aula(listaDeEstudiantes);

        miAula.iniciarClase();
    }
}
