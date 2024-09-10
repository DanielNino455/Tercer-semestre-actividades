import java.time.LocalDateTime;

public class Imc {
    private double pesoDeLaPersona;
    private double alturaPersona;
    private LocalDateTime fecha;

    public Imc(double pesoDeLaPersona, double alturaPersona) {
        this.pesoDeLaPersona = pesoDeLaPersona;
        this.alturaPersona = alturaPersona;
        this.fecha = LocalDateTime.now(); 
    }

    public Imc(double pesoDeLaPersona, double alturaPersona, LocalDateTime fechaDateTime) {
        this.pesoDeLaPersona = pesoDeLaPersona;
        this.alturaPersona = alturaPersona;
        this.fecha = fechaDateTime; 
    }

    public double calcularIMC() {
        if (alturaPersona <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor a 0");
        }
        return pesoDeLaPersona / (alturaPersona * alturaPersona);
    }

    public double getPeso() {
        return pesoDeLaPersona;
    }

    public double getAltura() {
        return alturaPersona;
    }

    public LocalDateTime getFecha() {
        return fecha; 
    }
}

