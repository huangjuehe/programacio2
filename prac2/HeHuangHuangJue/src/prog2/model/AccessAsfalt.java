package prog2.model;

import java.io.Serializable;

public abstract class AccesAsfalt extends Acces implements Serializable {
    private float m2Asfalt;

    public AccesAsfalt(String nom, boolean estat, float m2Asfalt) {
        super(nom, estat);
        this.m2Asfalt = m2Asfalt;
    }

    public float getM2Asfalt() { return this.m2Asfalt; }
    public void setM2Asfalt(float m2Asfalt) { this.m2Asfalt = m2Asfalt; }
}