
class Jugador {
    private String nombre;
    private Equipo equipo;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }
}


class Equipo {
    private String nombre;
    private Jugador jugador;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador getJugador() {
        return jugador;
    }
}

public class EjercicioAsociación {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Duvan Amaya");


        Equipo equipo = new Equipo("Real Madrid ");

    
        jugador.setEquipo(equipo);
        equipo.setJugador(jugador);

        // Mostrar el jugador y su equipo
        System.out.println(jugador.getNombre() + " juega en el equipo " + jugador.getEquipo().getNombre());
        System.out.println("El equipo " + equipo.getNombre() + " tiene como jugador a " + equipo.getJugador().getNombre());
    }
}