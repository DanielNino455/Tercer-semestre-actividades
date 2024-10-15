
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}


class Evento {
    private String nombre;

    public Evento(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}


class Matrimonio {
    private Persona persona;
    private Evento evento;
    public Matrimonio(Persona persona, Evento evento) {
        this.persona = persona;
        this.evento = evento;
    }
    public void mostrarMatrimonio() {
        System.out.println(persona.getNombre() + " está asociado al evento " + evento.getNombre());
    }
    public Persona getPersona() {
        return persona;
    }
    public Evento getEvento() {
        return evento;
    }
}

public class EjercicioRelacionesRestantes {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Daniel");
        Persona persona2 = new Persona("Lilibeth");
        Evento evento1 = new Evento("Boda");
        Evento evento2 = new Evento("Cumpleaños");

        Matrimonio matrimonio1 = new Matrimonio(persona1, evento1);
        Matrimonio matrimonio2 = new Matrimonio(persona2, evento1);
        Matrimonio matrimonio3 = new Matrimonio(persona1, evento2);

        matrimonio1.mostrarMatrimonio();
        matrimonio2.mostrarMatrimonio();
        matrimonio3.mostrarMatrimonio();
    }
}
