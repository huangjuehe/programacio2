package prog2.model;

import prog2.vista.ExcepcioCamping;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.Serializable;

public class LlistaTasquesManteniment implements InLlistaTasquesManteniment, Serializable {

    private ArrayList<TascaManteniment> llista;

    public LlistaTasquesManteniment() {
        this.llista = new ArrayList<>();
    }

    @Override
    public void afegirTascaManteniment(int num, String tipus, Allotjament allotjament, String data, int dies) throws ExcepcioCamping {
        // 1. Comprovem si l'allotjament ja té una tasca
        Iterator<TascaManteniment> it = this.llista.iterator();
        while (it.hasNext()) {
            TascaManteniment t = it.next();
            if (t.getAllotjament().getId().equals(allotjament.getId())) {
                throw new ExcepcioCamping("L'allotjament amb ID " + allotjament.getId() + " ja té una tasca de manteniment activa.");
            }
        }

        // 2. Intentem crear la tasca. Si el tipus no existeix a l'enum, llançarà error
        try {
            TascaManteniment novaTasca = new TascaManteniment(num, tipus, allotjament, data, dies);
            this.llista.add(novaTasca);
            // 3. Tanquem l'allotjament (i ell mateix ajustarà la il·luminació segons la tasca)
            allotjament.tancarAllotjament(novaTasca);
        } catch (IllegalArgumentException e) {
            throw new ExcepcioCamping("El tipus de tasca especificat no és vàlid.");
        }
    }

    @Override
    public void completarTascaManteniment(TascaManteniment tasca) throws ExcepcioCamping {
        if (this.llista.remove(tasca)) {
            // Si la tasca estava a la llista, obrim l'allotjament (operatiu = true i llum = 100%)
            tasca.getAllotjament().obrirAllotjament();
        } else {
            throw new ExcepcioCamping("La tasca número " + tasca.getNum() + " no existeix o ja s'ha completat.");
        }
    }

    @Override
    public String llistarTasquesManteniment() throws ExcepcioCamping {
        if (this.llista.isEmpty()) {
            throw new ExcepcioCamping("No hi ha cap tasca de manteniment activa.");
        }

        StringBuilder sb = new StringBuilder();
        Iterator<TascaManteniment> it = this.llista.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public TascaManteniment getTascaManteniment(int num) throws ExcepcioCamping {
        Iterator<TascaManteniment> it = this.llista.iterator();
        while (it.hasNext()) {
            TascaManteniment t = it.next();
            if (t.getNum() == num) {
                return t;
            }
        }
        throw new ExcepcioCamping("La tasca amb el número " + num + " no s'ha trobat.");
    }
}