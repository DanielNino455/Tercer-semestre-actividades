
interface Nadador {
    void nadar();
}


class Delfin implements Nadador {
    @Override
    public void nadar() {
        System.out.println("El delfín está nadando.");
    }
}

public class EjercicioImplements {
    public static void main(String[] args) {
        Delfin miDelfin = new Delfin();
        
        miDelfin.nadar();
    }
}
