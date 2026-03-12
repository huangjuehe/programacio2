package prog2.model;

public class Parcela extends Allotjament {
    // atributs: mida en m2 i amb o sense punt de connexió elèctrica
    private float mida;
    private boolean connexioElectrica;

    // L'estada mínima de Parcel·la és 4 (ALTA) i 2 (BAIXA)
    public Parcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica_) {
        super(nom_, idAllotjament_, 4, 2);
        this.mida = metres;
        this.connexioElectrica = connexioElectrica_;
    }

    public float getMida() {
        return mida;
    }

    public void setMida(float mida_) {
        this.mida = mida_;
    }

    public boolean isConnexioElectrica() {
        return connexioElectrica;
    }

    public void setConnexioElectrica(boolean connexioElectrica_) {
        this.connexioElectrica = connexioElectrica_;
    }

    @Override
    public boolean correcteFuncionament() {
        return connexioElectrica;
    }

    @Override
    public String toString() {
        return baseToString() + "Parcela {mida=" + mida + ", connexioElectrica=" + connexioElectrica + "}";
    }
}