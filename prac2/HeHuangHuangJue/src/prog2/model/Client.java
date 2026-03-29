package prog2.model;

public class Client implements InClient {
    // Atributs
    private String nom;
    private String dni;

    // Constructor
    public Client(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    /**
     * Obté el nom del client.
     * @return el nom del client.
     */
    @Override
    public String getNom() {
        return this.nom;
    }

    /**
     * Estableix el nom del client.
     * @param nom el nom a assignar.
     */
    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obté el DNI del client.
     * @return el DNI del client format per un String de 9 caràcters.
     */
    @Override
    public String getDni() {
        return this.dni;
    }

    /**
     * Estableix el DNI del client.
     * @param dni el DNI a assignar.
     */
    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Retorna una representació en format text de les dades del client.
     * @return la informació del client.
     */
    @Override
    public String toString() {
        return "Client {nom=" + this.nom + ", dni=" + this.dni + "}";
    }
}