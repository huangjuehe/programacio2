package prog2.model;

public class MobilHome extends Casa {

    private boolean terrassaBarbacoa;

    // L'estada mínima de Mobil-Home és 5 (Alta) i 3 (Baixa) segons la Taula 1.
    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions,
                     int placesPersones, boolean terrassaBarbacoa) {
        super(nom_, idAllotjament_, 5, 3, mida, habitacions, placesPersones);
        this.terrassaBarbacoa = terrassaBarbacoa;
    }

    public boolean isTerrassaBarbacoa() {
        return this.terrassaBarbacoa;
    }

    public void setTerrassaBarbacoa(boolean terrassaBarbacoa) {
        this.terrassaBarbacoa = terrassaBarbacoa;
    }

    @Override
    public boolean correcteFuncionament() {
        return this.terrassaBarbacoa;
    }

    @Override
    public String toString() {
        return baseToString() + "MobilHome {mida=" + getMida() + ", habitacions=" + getHabitacions() +
                ", placesPersones=" + getPlacesPersones() + ", terrassaBarbacoa=" + this.terrassaBarbacoa + "}";
    }
}