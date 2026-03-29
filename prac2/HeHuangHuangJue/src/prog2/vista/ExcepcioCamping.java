package prog2.vista;

/**
 * Classe per gestionar les excepcions personalitzades del Càmping a la Pràctica 2.
 */
public class ExcepcioCamping extends Exception {

    /**
     * Constructor que rep un missatge d'error.
     * @param missatge Missatge descriptiu de l'error.
     */
    public ExcepcioCamping(String missatge) {
        super(missatge);
    }
}