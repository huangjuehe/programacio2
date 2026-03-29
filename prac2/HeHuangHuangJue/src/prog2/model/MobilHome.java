package prog2.model;
import java.io.Serializable;

public class MobilHome extends Casa implements Serializable {
    private boolean terrassaBarbacoa;

    public MobilHome(String nom_, String idAllotjament_, boolean operatiu, String illuminacio, float mida, int habitacions,
                     int placesPersones, boolean terrassaBarbacoa) {
        // Estada Alta 5, Baixa 3
        super(nom_, idAllotjament_, 5, 3, operatiu, illuminacio, mida, habitacions, placesPersones);
        this.terrassaBarbacoa = terrassaBarbacoa;
    }

    // ... mantén getters/setters i el toString ...
    public boolean correcteFuncionament() { return this.terrassaBarbacoa; }
}