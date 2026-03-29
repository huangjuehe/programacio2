package prog2.model;

public class Parcela extends Allotjament {
    // atributs: mida en m2 i amb o sense punt de connexió elèctrica
    private float mida;
    private boolean connexioElectrica;

    // L'estada mínima de Parcel·la és 4 (ALTA) i 2 (BAIXA)
    public Parcela(String nom, String id, boolean operatiu, String illuminacio, float mida, boolean connexioElectrica) {
        // Estada Alta = 4, Baixa = 2 segons Taula 1
        super(nom, id, 4, 2, operatiu, illuminacio);
        this.mida = mida;
        this.connexioElectrica = connexioElectrica;
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