import java.util.ArrayList;
import java.util.List;


class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}


class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void añadirLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        System.out.println("Lista de libros en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println("- " + libro.getTitulo());
        }
    }
}

public class EjercicioCardinalidad {
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();
        
        Libro libro1 = new Libro("Indigno de ser humano");
        Libro libro2 = new Libro("Las 48 leyes del poder");
        Libro libro3 = new Libro("Crimen y Castigo");
        
        miBiblioteca.añadirLibro(libro1);
        miBiblioteca.añadirLibro(libro2);
        miBiblioteca.añadirLibro(libro3);
        
        miBiblioteca.mostrarLibros();
    }
}