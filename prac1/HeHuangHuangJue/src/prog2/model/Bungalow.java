package prog2.model;

public class Bungalow extends Casa {

    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;

    // L'estada mínima de Bungalow és 7 (Alta) i 4 (Baixa) segons la Taula 1.
    public Bungalow(String nom_, String idAllotjament_, String mida, int habitacions,
                    int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(nom_, idAllotjament_, 7, 4, mida, habitacions, placesPersones);
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

    public int getPlacesParquing() {
        return this.placesParquing;
    }

    public void setPlacesParquing(int placesParquing) {
        this.placesParquing = placesParquing;
    }

    public boolean isTerrassa() {
        return this.terrassa;
    }

    public void setTerrassa(boolean terrassa) {
        this.terrassa = terrassa;
    }

    public boolean isTv() {
        return this.tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isAireFred() {
        return this.aireFred;
    }

    public void setAireFred(boolean aireFred) {
        this.aireFred = aireFred;
    }

    @Override
    public boolean correcteFuncionament() {
        return this.aireFred;
    }

    @Override
    public String toString() {
        return baseToString() + "Bungalow {mida=" + getMida() + ", habitacions=" + getHabitacions() +
                ", placesPersones=" + getPlacesPersones() + ", placesParquing=" + this.placesParquing +
                ", terrassa=" + this.terrassa + ", tv=" + this.tv + ", aireFred=" + this.aireFred + "}";
    }
}