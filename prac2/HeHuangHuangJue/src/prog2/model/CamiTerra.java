package prog2.model;

import java.io.Serializable;

public class CamiTerra extends AccesTerra implements Serializable {

    public CamiTerra(String nom, boolean estat, float longitud) {
        super(nom, estat, longitud);
    }

    @Override
    public boolean isAccessibilitat() {
        return false; // El camí no permet accessibilitat amb vehicle
    }

    @Override
    public String toString() {
        return super.toString() + " Tipus: Camí de Terra {longitud=" + this.getLongitud() + "}";
    }
}