package prog2.model;

import java.io.Serializable;

public class CamiAsfaltat extends AccesAsfalt implements Serializable {

    public CamiAsfaltat(String nom, boolean estat, float m2Asfalt) {
        super(nom, estat, m2Asfalt);
    }

    @Override
    public boolean isAccessibilitat() {
        return false; // El camí no permet accessibilitat amb vehicle
    }

    @Override
    public String toString() {
        return super.toString() + " Tipus: Camí Asfaltat {m2Asfalt=" + this.getM2Asfalt() + "}";
    }
}