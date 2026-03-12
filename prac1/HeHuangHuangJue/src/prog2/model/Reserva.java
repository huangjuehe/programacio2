package prog2.model;

import java.time.LocalDate;

public class Reserva implements InReserva {
    // Atributs
    private Allotjament allotjament;
    private Client client;
    private LocalDate dataEntrada;
    private LocalDate dataSortida;

    // Constructor
    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) {
        this.allotjament = allotjament;
        this.client = client;
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
    }

    /**
     * Obté l'allotjament de la reserva.
     * @return l'allotjament reservat.
     */
    public Allotjament getAllotjament_() {
        return this.allotjament;
    }

    /**
     * Estableix l'allotjament de la reserva.
     * @param allotjament_ l'allotjament a assignar.
     */
    public void setAllotjament_(Allotjament allotjament_) {
        this.allotjament = allotjament_;
    }

    /**
     * Obté el client que fa la reserva.
     * @return el client de la reserva.
     */
    public Client getClient() {
        return this.client;
    }

    /**
     * Estableix el client de la reserva.
     * @param client_ el client a assignar.
     */
    public void setClient(Client client_) {
        this.client = client_;
    }

    /**
     * Obté la data d'entrada de la reserva.
     * @return la data d'entrada.
     */
    public LocalDate getDataEntrada() {
        return this.dataEntrada;
    }

    /**
     * Estableix la data d'entrada de la reserva.
     * @param dataEntrada_ la data d'entrada a assignar.
     */
    public void setDataEntrada(LocalDate dataEntrada_) {
        this.dataEntrada = dataEntrada_;
    }

    /**
     * Obté la data de sortida de la reserva.
     * @return la data de sortida.
     */
    public LocalDate getDataSortida() {
        return this.dataSortida;
    }

    /**
     * Estableix la data de sortida de la reserva.
     * @param dataSortida_ la data de sortida a assignar.
     */
    public void setDataSortida(LocalDate dataSortida_) {
        this.dataSortida = dataSortida_;
    }

    /**
     * Retorna una representació en format text de la reserva.
     * @return la informació de la reserva.
     */
    public String toString() {
        return "Reserva {allotjament=" + this.allotjament.getNom() + ", client=" + this.client.getNom() +
                ", dataEntrada=" + this.dataEntrada + ", dataSortida=" + this.dataSortida + "}";
    }
}