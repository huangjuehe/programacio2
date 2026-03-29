package prog2.model;
import java.io.Serializable;

public class Bungalow extends Casa implements Serializable {
    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;

    public Bungalow(String nom_, String idAllotjament_, boolean operatiu, String illuminacio, float mida, int habitacions,
                    int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        // Estada Alta 7, Baixa 4
        super(nom_, idAllotjament_, 7, 4, operatiu, illuminacio, mida, habitacions, placesPersones);
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

    // ... mantén els teus getters/setters i el toString d'abans ...
    public boolean correcteFuncionament() {
        return this.aireFred;
    }

    public boolean isAireFred() {
        return this.aireFred;
    }
}