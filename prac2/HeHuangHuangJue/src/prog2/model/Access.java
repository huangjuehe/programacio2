package prog2.model;

import java.io.Serializable;
import prog2.vista.ExcepcioCamping;

public abstract class Acces implements InAcces, Serializable {

    private String nom;
    private boolean estat; // true = obert, false = tancat
    private LlistaAllotjaments llistaAllotjaments;

    public Acces(String nom, boolean estat) {
        this.nom = nom;
        this.estat = estat;
        this.llistaAllotjaments = new LlistaAllotjaments();
    }

    @Override
    public void afegirAllotjament(Allotjament allotjament) {
        try {
            this.llistaAllotjaments.afegirAllotjament(allotjament);
        } catch (ExcepcioCamping e) {
            // La interfície InAcces no llança excepcions aquí
        }
    }

    @Override
    public void tancarAcces() {
        this.estat = false;
    }

    @Override
    public void obrirAcces() {
        this.estat = true;
    }

    // Aquest mètode és abstracte i s'implementa a les classes filles (Terra, Asfalt)
    @Override
    public abstract boolean isAccessibilitat();

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public boolean getEstat() {
        return this.estat;
    }

    @Override
    public LlistaAllotjaments getAAllotjaments() {
        return this.llistaAllotjaments;
    }

    @Override
    public String toString() {
        String estatStr = this.estat ? "Obert" : "Tancat";
        return "Acces {nom=" + this.nom + ", estat=" + estatStr + "}";
    }
}