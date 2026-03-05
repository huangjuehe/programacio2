package prog2.model;

public abstract class Allotjament implements InAllotjament {

    // 1. Aquí definiràs els teus atributs privats (nom, id, estada mínima...)

    // 2. Aquí crearàs el teu Constructor

    // 3. Aquí faràs els "getters" i "setters" per donar vida als mètodes de la interfície.
    /**
     * Obté el nom de l'allotjament.
     * @return el nom de l'allotjament.
     */
    private String nom;
    private String id;
    private int estadaMinima;
    private int estadaMinimaBAIXA;

    String getNom(){

    }

    /**
     * Estableix el nom de l'allotjament.
     * @param nom el nom a assignar.
     */
    void setNom(String nom);

    /**
     * Obté l'identificador únic de l'allotjament.
     * @return l'identificador únic de l'allotjament.
     */
    String getId();

    /**
     * Estableix l'identificador únic de l'allotjament.
     * @param id l'identificador a assignar.
     */
    void setId(String id);

    /**
     * Obté l'estada mínima segons la temporada.
     * @param temp la temporada (ALTA o BAIXA).
     * @return el valor de l'estada mínima per a la temporada indicada.
     */
    long getEstadaMinima(InAllotjament.Temp temp);

    /**
     * Estableix l'estada mínima per a cada temporada.
     * @param estadaMinimaALTA_ l'estada mínima en temporada alta.
     * @param estadaMinimaBAIXA_ l'estada mínima en temporada baixa.
     */
    void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_);

    /**
     * Comprova si l'allotjament funciona correctament.
     * La implementació dependrà dels criteris específics de cada tipus d'allotjament.
     * @return true si l'allotjament funciona correctament, false altrament.
     */
    boolean correcteFuncionament();

    /**
     * Enumeració que representa les diferents temporades possibles.
     */
    enum Temp {
        ALTA,
        BAIXA
    }

}