package prog2.model;

import prog2.vista.ExcepcioCamping;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.Serializable;

public class LlistaAccessos implements InLlistaAccessos, Serializable {

    private ArrayList<Acces> llista;

    public LlistaAccessos() {
        this.llista = new ArrayList<>();
    }

    @Override
    public void afegirAcces(Acces acc) throws ExcepcioCamping {
        this.llista.add(acc);
    }

    @Override
    public void buidar() {
        this.llista.clear();
    }

    @Override
    public String llistarAccessos(boolean estat) throws ExcepcioCamping {
        StringBuilder sb = new StringBuilder();
        boolean trobat = false;

        Iterator<Acces> it = this.llista.iterator();
        while (it.hasNext()) {
            Acces a = it.next();
            if (a.getEstat() == estat) {
                sb.append(a.toString()).append("\n");
                trobat = true;
            }
        }

        if (!trobat) {
            String txtEstat = estat ? "Oberts" : "Tancats";
            throw new ExcepcioCamping("No hi ha cap accés en estat: " + txtEstat);
        }
        return sb.toString();
    }

    @Override
    public void actualitzaEstatAccessos() throws ExcepcioCamping {
        Iterator<Acces> it = this.llista.iterator();
        while (it.hasNext()) {
            Acces a = it.next();
            // Primer el tanquem per defecte
            a.tancarAcces();
            // I si la llista d'allotjaments que depenen d'aquest accés en té algun d'operatiu, l'obrim.
            if (a.getAAllotjaments().containsAllotjamentOperatiu()) {
                a.obrirAcces();
            }
        }
    }

    @Override
    public int calculaAccessosNoAccessibles() throws ExcepcioCamping {
        int count = 0;
        Iterator<Acces> it = this.llista.iterator();
        while (it.hasNext()) {
            Acces a = it.next();
            if (!a.isAccessibilitat()) {
                count++;
            }
        }
        return count;
    }

    @Override
    public float calculaMetresTerra() throws ExcepcioCamping {
        float totalMetres = 0;
        Iterator<Acces> it = this.llista.iterator();
        while (it.hasNext()) {
            Acces a = it.next();
            if (a instanceof AccesTerra) {
                // Fem cast a AccesTerra per poder obtenir la longitud
                totalMetres += ((AccesTerra) a).getLongitud();
            }
        }
        return totalMetres;
    }
}