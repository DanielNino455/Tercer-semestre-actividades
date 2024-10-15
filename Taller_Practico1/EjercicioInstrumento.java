abstract  class Instrumento {
    public abstract void tocar();
}
interface Afinable{
void afinar();
}
class Guitarra extends Instrumento implements Afinable{

@Override
public void tocar(){
    System.out.println();
}
@Override
public void afinar(){
    System.out.println();
}
}

public class EjercicioInstrumento {
public static void main(String[] args) {
    Instrumento instrumento = new Guitarra();
    Afinable afin = new Guitarra();

    instrumento.tocar();
    afin.afinar();
}
}
