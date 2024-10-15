
class Puerta {
    private String material;

    public Puerta(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
}


class Casa {
    private Puerta puerta;
    public Casa(Puerta puerta) {
        if (puerta == null) {
            throw new IllegalArgumentException("Una casa no puede existir sin una puerta.");
        }
        this.puerta = puerta;
    }
    public void cambiarPuerta(Puerta nuevaPuerta) {
        if (nuevaPuerta == null) {
            throw new IllegalArgumentException("La puerta no puede ser nula.");
        }
        this.puerta = nuevaPuerta;
    }


    public Puerta obtenerPuerta() {
        return this.puerta;
    }
    public void eliminarPuerta() {
        throw new UnsupportedOperationException("No se puede eliminar la puerta, TONTOOOOO! ");
    }
}
