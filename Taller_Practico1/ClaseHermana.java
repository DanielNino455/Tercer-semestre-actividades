
class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se mueve.");
    }
}


class Moto extends Vehiculo {
    @Override
    public void mover() {
    System.out.println("La moto se mueve rápidamente.");
    }
    }


class Avion extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El avion vuela.");
    }
}


public class ClaseHermana {
    public static void main(String[] args) {
        Vehiculo a = new Avion();
        Vehiculo v = new Moto();
        v.mover();
        a.mover();
    }
}