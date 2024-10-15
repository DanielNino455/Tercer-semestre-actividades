class Animal {
    
    public void hacerSonido() {
        System.out.println("El animal está haciendo un sonido.");
    }
}


class Perro extends Animal {
    public void moverCola() {
        System.out.println("El perro mueve la cola.");
    }
}

public class EjercicioHerencia {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        
        miPerro.hacerSonido();
        miPerro.moverCola();
    }
}