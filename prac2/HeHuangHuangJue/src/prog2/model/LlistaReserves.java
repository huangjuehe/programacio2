package prog2.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

import prog2.vista.ExcepcioReserva;

public class LlistaReserves implements InLlistaReserves {

    // Atributs
    private ArrayList<Reserva> llista;

    // Constructor
    public LlistaReserves() {
        this.llista = new ArrayList<>();
    }

    /**
     * Retorna el número de reserves de la llista.
     * @return el número de reserves.
     */
    public int getNumReserves() {
        return this.llista.size();
    }

    /**
     * Comprova si l'allotjament està disponible per a les dates indicades.
     * @param allotjament l'allotjament a comprovar.
     * @param dataEntrada la data d'entrada de la nova reserva.
     * @param dataSortida la data de sortida de la nova reserva.
     * @return true si està disponible, false altrament.
     */
    private boolean allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) {
        // Utilitzem Iterator explícit com demana el document de suport
        Iterator<Reserva> it = this.llista.iterator();
        while (it.hasNext()) {
            Reserva r = it.next();
            // Si és el mateix allotjament, hem de comprovar que les dates no es creuin
            if (r.getAllotjament_().getId().equals(allotjament.getId())) {
                // Hi ha solapament si la nova entrada és abans de la sortida existent
                // I la nova sortida és després de l'entrada existent
                if (dataEntrada.isBefore(r.getDataSortida()) && dataSortida.isAfter(r.getDataEntrada())) {
                    return false; // L'allotjament ja està ocupat en aquestes dates
                }
            }
        }
        return true; // Si acabem el bucle sense trobar solapaments, està disponible
    }

    /**
     * Comprova si l'estada sol·licitada compleix l'estada mínima de l'allotjament segons la temporada.
     * @param allotjament l'allotjament a comprovar.
     * @param dataEntrada la data d'entrada de la reserva.
     * @param dataSortida la data de sortida de la reserva.
     * @return true si l'estada és major o igual a la mínima, false altrament.
     */
    private boolean isEstadaMinima(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) {
        long estada = ChronoUnit.DAYS.between(dataEntrada, dataSortida);
        InAllotjament.Temp temporada = Camping.getTemporada(dataEntrada); // Utilitza el mètode estàtic de Camping
        long estadaMinima = allotjament.getEstadaMinima(temporada);

        return estada >= estadaMinima;
    }

    /**
     * Comprova que l'estada que es demani sigui més llarga o igual que l'estada mínima.
     * Comprova que l'allotjament estigui disponible pels dies indicats.
     * En cas afirmatiu, crea la reserva i l'afegeix a la llista de reserves del camping.
     * En cas negatiu, llança una excepció de tipus ExceptionReserva amb el missatge d'error.
     * * @param allotjament l'allotjament a reservar.
     * @param client el client que fa la reserva.
     * @param dataEntrada la data d'entrada de la reserva.
     * @param dataSortida la data de sortida de la reserva.
     * @throws ExcepcioReserva si no compleix l'estada mínima o no està disponible.
     */
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

        // 1. Comprovem disponibilitat
        if (!this.allotjamentDisponible(allotjament, dataEntrada, dataSortida)) {
            throw new ExcepcioReserva("L'allotjament amb identificador " + allotjament.getId() +
                    " no està disponible en la data demanada " + dataEntrada +
                    " pel client " + client.getNom() + " amb DNI: " + client.getDni() + ".");
        }

        // 2. Comprovem l'estada mínima
        if (!this.isEstadaMinima(allotjament, dataEntrada, dataSortida)) {
            throw new ExcepcioReserva("Les dates sol·licitades pel client " + client.getNom() +
                    " amb DNI: " + client.getDni() +
                    " no compleixen l'estada mínima per l'allotjament amb identificador " + allotjament.getId() + ".");
        }

        // 3. Si tot és correcte, creem la reserva i l'afegim
        Reserva novaReserva = new Reserva(allotjament, client, dataEntrada, dataSortida);
        this.llista.add(novaReserva);
    }
}