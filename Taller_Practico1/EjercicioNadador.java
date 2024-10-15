interface Nadador {
    void nadar();
}


class Pez implements Nadador {
    @Override
    public void nadar() {
        System.out.println("El pez esta nadando");
    }
}

public class EjercicioNadador {
public static void main(String[] args) {
        Nadador miPez = new Pez();
        miPez.nadar();
    }
}