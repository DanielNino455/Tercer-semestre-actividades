abstract class Animal {

public abstract void hacerSonido();
}


class Perro extends Animal {

@Override
public void hacerSonido() {
    System.out.println("Guau!");
}
}


public class EjercicioAnimal {
public static void main(String[] args) {
    Animal miPerro = new Perro();
    miPerro.hacerSonido();
}
}