import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private String genero;
    private List<Imc> listadoImc;

    public Usuario(String nombre, String apellido, String cedula, String email, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.genero = genero;
        this.listadoImc = new ArrayList<>();
    }

    public void AñadirIMC(double peso, double altura) {
        Imc imc = new Imc(peso, altura);
        this.listadoImc.add(imc);
    }

    public void MostrarIMC() {
        if (listadoImc.isEmpty()) {
            System.out.println("No existe registro IMC.");
        } else {
            for (Imc imc : listadoImc) {
                double calculoImc = imc.calcularIMC();
                double pesoDeLaPersona = imc.getPeso();
                double alturaPersona = imc.getAltura();
                String fechaDateTiempo = imc.getFecha().toString(); 
                System.out.printf("IMC: %.2f (peso %.2f kg, Altura: %.2 m, fecha: %s)%n", calculoImc, pesoDeLaPersona, alturaPersona, fechaDateTiempo);
            }
        }
    }
}
