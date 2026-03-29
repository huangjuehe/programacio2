package prog2.model;

import java.io.Serializable;

public class TascaManteniment implements InTascaManteniment, Serializable {

    public static enum TipusTascaManteniment {
        Reparacio,
        Neteja,
        RevisioTecnica,
        Desinfeccio
    }

    private int numTasca;
    private TipusTascaManteniment tipus;
    private Allotjament allotjament; // Guardem TOTA la referència a l'Allotjament
    private String data;
    private int dies;

    // Fixa't que en el constructor rep un (Allotjament allotjament)
    public TascaManteniment(int numTasca, String tipus, Allotjament allotjament, String data, int dies) {
        this.numTasca = numTasca;
        this.tipus = TipusTascaManteniment.valueOf(tipus);
        this.allotjament = allotjament;
        this.data = data;
        this.dies = dies;
    }

    @Override
    public int getNum() { return this.numTasca; }
    @Override
    public void setNum(int num_) { this.numTasca = num_; }

    @Override
    public TipusTascaManteniment getTipus() { return this.tipus; }
    @Override
    public void setTipus(TipusTascaManteniment tipus_) { this.tipus = tipus_; }

    @Override
    public Allotjament getAllotjament() { return this.allotjament; }
    @Override
    public void setAllotjament(Allotjament allotjament_) { this.allotjament = allotjament_; }

    @Override
    public String getData() { return this.data; }
    @Override
    public void setData(String data_) { this.data = data_; }

    @Override
    public int getDies() { return this.dies; }
    @Override
    public void setDies(int dies_) { this.dies = dies_; }

    @Override
    public String getIluminacioAllotjament() {
        switch (this.tipus) {
            case Reparacio: return "50%";
            case Neteja: return "100%";
            case RevisioTecnica: return "50%";
            case Desinfeccio: return "0%";
            default: return "100%";
        }
    }

    @Override
    public String toString() {
        return "TascaManteniment {num=" + this.numTasca + ", tipus=" + this.tipus +
                ", allotjament=" + this.allotjament.getId() + ", data=" + this.data + ", dies=" + this.dies + "}";
    }
}