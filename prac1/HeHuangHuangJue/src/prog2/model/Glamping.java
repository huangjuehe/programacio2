package prog2.model;

public class Glamping extends Casa {

    private String material;
    private boolean casaMascota;

    // L'estada mínima de Glamping és 3 (Alta) i 3 (Baixa) segons la Taula 1.
    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions,
                    int placesPersones, String material, boolean casaMascota) {
        super(nom_, idAllotjament_, 3, 3, mida, habitacions, placesPersones);
        this.material = material;
        this.casaMascota = casaMascota;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isCasaMascota() {
        return this.casaMascota;
    }

    public void setCasaMascota(boolean casaMascota) {
        this.casaMascota = casaMascota;
    }

    @Override
    public boolean correcteFuncionament() {
        return this.casaMascota;
    }

    @Override
    public String toString() {
        return baseToString() + "Glamping {mida=" + getMida() + ", habitacions=" + getHabitacions() +
                ", placesPersones=" + getPlacesPersones() + ", material=" + this.material +
                ", casaMascota=" + this.casaMascota + "}";
    }
}