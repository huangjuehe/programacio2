/**
 * Classe Habitacio
 */
public class Habitacio {
    private int numero;
    private boolean disponible;

    // Mètode constructor o s'inicialitzen els valors dels atributs
    public Habitacio(int numero) {
        this.numero = numero;
        this.disponible = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Mètode per reservar l'habitació
    public void reservar() {
        if (!disponible) {
            throw new IllegalStateException("L'habitació ja està reservada.");
        }
        this.disponible = false;
    }
    // Mètode per alliberar l'habitació
    public void liberar() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        String info = "Numero: " + numero + "\nDisponible: " + disponible;
        return info;
    }
}
