package prog2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import prog2.vista.ExcepcioReserva;

public class Camping implements InCamping {

    // Atributs
    private String nom;
    private ArrayList<Allotjament> llistaAllotjaments;
    private ArrayList<Client> llistaClients;
    private LlistaReserves llistaReserves;

    // Constructor
    public Camping(String nom) {
        this.nom = nom;
        this.llistaAllotjaments = new ArrayList<>();
        this.llistaClients = new ArrayList<>();
        this.llistaReserves = new LlistaReserves();
    }

    /**
     * Retorna el nom del càmping.
     * @return el nom del càmping.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Retorna la llista de reserves del camping.
     * @return la llista de reserves.
     */
    public LlistaReserves getLlistaReserves() {
        return this.llistaReserves;
    }

    /**
     * Retorna la llista d'allotjaments del camping.
     * @return la llista d'allotjaments.
     */
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return this.llistaAllotjaments;
    }

    /**
     * Retorna la llista de clients del camping.
     * @return la llista de clients.
     */
    public ArrayList<Client> getLlistaClients() {
        return this.llistaClients;
    }

    /**
     * Retorna el número total d'allotjaments del càmping.
     * @return el número total d'allotjaments.
     */
    public int getNumAllotjaments() {
        return this.llistaAllotjaments.size();
    }

    /**
     * Retorna el número total de reserves del càmping.
     * @return el número total de reserves.
     */
    public int getNumReserves() {
        return this.llistaReserves.getNumReserves();
    }

    /**
     * Retorna el número total de clients del càmping.
     * @return el número total de clients.
     */
    public int getNumClients() {
        return this.llistaClients.size();
    }

    /**
     * Cerca un allotjament a la llista pel seu identificador fent servir un Iterator.
     * @param id l'identificador a buscar.
     * @return l'allotjament trobat, o null si no existeix.
     */
    private Allotjament buscarAllotjament(String id) {
        Iterator<Allotjament> it = this.llistaAllotjaments.iterator();
        while (it.hasNext()) {
            Allotjament a = it.next();
            if (a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }

    /**
     * Cerca un client a la llista pel seu DNI fent servir un Iterator.
     * @param dni el DNI a buscar.
     * @return el client trobat, o null si no existeix.
     */
    private Client buscarClient(String dni) {
        Iterator<Client> it = this.llistaClients.iterator();
        while (it.hasNext()) {
            Client c = it.next();
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Calcula a quina temporada correspon una data.
     * @param data la data a avaluar.
     * @return Temp.ALTA (21 març a 20 setembre) o Temp.BAIXA (resta de l'any).
     */
    public static InAllotjament.Temp getTemporada(LocalDate data) {
        int mes = data.getMonthValue();
        int dia = data.getDayOfMonth();

        // Temporada Alta: del 21 de març (mes 3) al 20 de setembre (mes 9)
        if ((mes > 3 && mes < 9) || (mes == 3 && dia >= 21) || (mes == 9 && dia <= 20)) {
            return InAllotjament.Temp.ALTA;
        } else {
            return InAllotjament.Temp.BAIXA;
        }
    }

    /**
     * Crea un nou objecte de tipus Client i l'afegeix a la llista de clients.
     * @param nom_ el nom del nou client.
     * @param dni_ el DNI del nou client.
     */
    public void afegirClient(String nom_, String dni_) {
        Client c = new Client(nom_, dni_);
        this.llistaClients.add(c);
    }

    /**
     * Afegeix una nova parcel·la a la llista d'allotjaments.
     * @param nom_ el nom de la parcela.
     * @param idAllotjament_ l'identificador únic de l'allotjament.
     * @param metres la mida de la parcela.
     * @param connexioElectrica true si disposa de connexió elèctrica.
     */
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        Parcela p = new Parcela(nom_, idAllotjament_, metres, connexioElectrica);
        this.llistaAllotjaments.add(p);
    }

    /**
     * Afegeix un nou bungalow a la llista d'allotjaments.
     */
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        Bungalow b = new Bungalow(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        this.llistaAllotjaments.add(b);
    }

    /**
     * Afegeix un bungalow premium a la llista d'allotjaments.
     */
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        BungalowPremium bp = new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        this.llistaAllotjaments.add(bp);
    }

    /**
     * Afegeix una casa glamping a la llista d'allotjaments.
     */
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
        Glamping g = new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
        this.llistaAllotjaments.add(g);
    }

    /**
     * Afegeix una mobil-home a la llista d'allotjaments.
     */
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        MobilHome mh = new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones, terrassaBarbacoa);
        this.llistaAllotjaments.add(mh);
    }

    /**
     * Cerca el client i l'allotjament i invoca el mètode de la llista de reserves.
     * @throws ExcepcioReserva si no es pot realitzar la reserva o no es troben les dades.
     */
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        Allotjament allotjament = this.buscarAllotjament(id_);
        Client client = this.buscarClient(dni_);

        if (allotjament == null || client == null) {
            throw new ExcepcioReserva("L'allotjament amb id " + id_ + " o el client amb DNI " + dni_ + " no existeixen al càmping.");
        }

        this.llistaReserves.afegirReserva(allotjament, client, dataEntrada, dataSortida);
    }

    /**
     * Recorre la llista per comptar el número d'allotjaments que estan operatius.
     * @return el nombre d'allotjaments operatius.
     */
    public int calculAllotjamentsOperatius() {
        int operatius = 0;
        Iterator<Allotjament> it = this.llistaAllotjaments.iterator();
        while (it.hasNext()) {
            Allotjament a = it.next();
            if (a.correcteFuncionament()) {
                operatius++;
            }
        }
        return operatius;
    }

    /**
     * Cerca i retorna l'allotjament amb estada mínima de la temporada donada més curta.
     * @return l'allotjament corresponent.
     */
    public Allotjament getAllotjamentEstadaMesCurta(InAllotjament.Temp temp) {
        if (this.llistaAllotjaments.isEmpty()) return null;

        Iterator<Allotjament> it = this.llistaAllotjaments.iterator();
        Allotjament allotjamentMesCurt = it.next(); // Agafem el primer com a referència
        long estadaMinimaCurta = allotjamentMesCurt.getEstadaMinima(temp);

        while (it.hasNext()) {
            Allotjament a = it.next();
            long estadaActual = a.getEstadaMinima(temp);
            if (estadaActual < estadaMinimaCurta) {
                estadaMinimaCurta = estadaActual;
                allotjamentMesCurt = a;
            }
        }
        return allotjamentMesCurt;
    }
}