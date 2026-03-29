package prog2.model;

import java.io.Serializable;

public class CarreteraAsfaltada extends AccesAsfalt implements Serializable {
    private float pesMaxim;

    public CarreteraAsfaltada(String nom, boolean estat, float m2Asfalt, float pesMaxim) {
        super(nom, estat, m2Asfalt);
        this.pesMaxim = pesMaxim;
    }

    public float getPesMaxim() { return this.pesMaxim; }
    public void setPesMaxim(float pesMaxim) { this.pesMaxim = pesMaxim; }

    @Override
    public boolean isAccessibilitat() {
        return true; // La carretera sí permet accessibilitat amb vehicle
    }

    @Override
    public String toString() {
        return super.toString() + " Tipus: Carretera Asfaltada {m2Asfalt=" + this.getM2Asfalt() + ", pesMaxim=" + this.pesMaxim + "}";
    }
}