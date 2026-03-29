package prog2.model;
import java.io.Serializable;

public class Glamping extends Casa implements Serializable {
    private String material;
    private boolean casaMascota;

    public Glamping(String nom_, String idAllotjament_, boolean operatiu, String illuminacio, float mida, int habitacions,
                    int placesPersones, String material, boolean casaMascota) {
        // Estada Alta 3, Baixa 3
        super(nom_, idAllotjament_, 3, 3, operatiu, illuminacio, mida, habitacions, placesPersones);
        this.material = material;
        this.casaMascota = casaMascota;
    }

    // ... mantén getters/setters i el toString ...
    public boolean correcteFuncionament() { return this.casaMascota; }
}