package prog2.model;

public abstract class Allotjament implements InAllotjament {
    // Atributs
    private String nom;
    private String id;
    private long estadaMinimaALTA;
    private long estadaMinimaBAIXA;
    private boolean operatiu;
    private String illuminacio; // "100%", "50%", o "0%"

    // Constructor
    public Allotjament(String nom, String id, long estadaMinimaALTA, long estadaMinimaBAIXA, boolean operatiu, String iluminacio) {
        this.nom = nom;
        this.id = id;
        this.estadaMinimaALTA = estadaMinimaALTA;
        this.estadaMinimaBAIXA = estadaMinimaBAIXA;
        this.operatiu = true;
        this.illuminacio = "100%";
    }

    /**
     * Obté el nom de l'allotjament.
     * @return el nom de l'allotjament.
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Estableix el nom de l'allotjament.
     * @param nom el nom a assignar.
     */
    public void setNom(String nom){
        this.nom = nom;
    }

    /**
     * Obté l'identificador únic de l'allotjament.
     * @return l'identificador únic de l'allotjament.
     */
    public String getId(){
        return this.id;
    }

    /**
     * Estableix l'identificador únic de l'allotjament.
     * @param id l'identificador a assignar.
     */
    public void setId(String id){
        this.id = id;
    }

    /**
     * Obté l'estada mínima segons la temporada.
     * @param temp la temporada (ALTA o BAIXA).
     * @return el valor de l'estada mínima per a la temporada indicada.
     */
    public long getEstadaMinima(InAllotjament.Temp temp){
        if(Temp.ALTA == temp){
            return this.estadaMinimaALTA;
        } else{
            return this.estadaMinimaBAIXA;
        }
    }

    /**
     * Estableix l'estada mínima per a cada temporada.
     * @param estadaMinimaALTA_ l'estada mínima en temporada alta.
     * @param estadaMinimaBAIXA_ l'estada mínima en temporada baixa.
     */
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_){
        this.estadaMinimaALTA = estadaMinimaALTA_;
        this.estadaMinimaBAIXA = estadaMinimaBAIXA_;
    }

    /**
     * Comprova si l'allotjament funciona correctament.
     * La implementació dependrà dels criteris específics de cada tipus d'allotjament.
     * @return true si l'allotjament funciona correctament, false altrament.
     */
    public abstract boolean correcteFuncionament();


    /**
     * Enumeració que representa les diferents temporades possibles.
     * enum Temp {
        ALTA,
        BAIXA
    } */

    // Mètode de suport per reutilitzar al toString de les subclasses
    protected String baseToString() {
        String estatStr = this.operatiu ? "Operatiu" : "No operatiu";
        return "Nom=" + this.nom + ", Id=" + this.id + " estada mínima en temp ALTA: " + this.estadaMinimaALTA +
                ", estada mínima en temp BAIXA: " + this.estadaMinimaBAIXA +
                ". Estat: " + estatStr + ", Il·luminació: " + this.illuminacio + ". ";
    }

    // --- Mètodes nous Pràctica 2 ---

    @Override
    public void tancarAllotjament(TascaManteniment tasca) {
        this.operatiu = false;
        // La il·luminació dependrà de la tasca que rebem per paràmetre
        this.illuminacio = tasca.getIluminacioAllotjament();
    }

    @Override
    public void obrirAllotjament() {
        this.operatiu = true;
        this.illuminacio = "100%";
    }

    public boolean isOperatiu() {
        return this.operatiu;
    }

    public void setOperatiu(boolean operatiu) {
        this.operatiu = operatiu;
    }

    public String getIlluminacio() {
        return this.illuminacio;
    }

    public void setIlluminacio(String illuminacio) {
        this.illuminacio = illuminacio;
    }
}