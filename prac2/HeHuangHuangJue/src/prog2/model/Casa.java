package prog2.model;

import java.io.Serializable;

public abstract class Casa extends Allotjament implements Serializable {

    private float mida;
    private int habitacions;
    private int placesPersones;

    public Casa(String nom, String id, long estadaMinimaALTA, long estadaMinimaBAIXA, boolean operatiu, String illuminacio,
                float mida, int habitacions, int placesPersones) {
        super(nom, id, estadaMinimaALTA, estadaMinimaBAIXA, operatiu, illuminacio);
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
    }

    public float getMida() {
        return this.mida;
    }

    public void setMida(float mida_) {
        this.mida = mida_;
    }

    public int getHabitacions() {
        return this.habitacions;
    }

    public void setHabitacions(int habitacions_) {
        this.habitacions = habitacions_;
    }

    public int getPlacesPersones() {
        return this.placesPersones;
    }

    public void setPlacesPersones(int placesPersones_) {
        this.placesPersones = placesPersones_;
    }
}