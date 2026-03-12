package prog2.model;

public abstract class Casa extends Allotjament {

    private String mida;
    private int habitacions;
    private int placesPersones;

    public Casa(String nom, String id, long estadaMinimaALTA, long estadaMinimaBAIXA,
                String mida, int habitacions, int placesPersones) {
        super(nom, id, estadaMinimaALTA, estadaMinimaBAIXA);
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
    }

    public String getMida() {
        return this.mida;
    }

    public void setMida(String mida_) {
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