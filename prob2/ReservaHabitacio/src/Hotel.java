import java.util.HashMap;
import java.util.Map;

/**
 * Classe Hotel
 */
public class Hotel {
    private String nomHotel;
    // Atribut per guardar el conjunt d'habitacions de l'hotel
    private HashMap<Integer, Habitacio> habitacions;

    public Hotel(String nomHotel) {
        this.nomHotel = nomHotel;
        habitacions = new HashMap<>();
    }

    // Mètode per agregar una habitació al conjunt d'habitacions de l'hotel
    public void agregarHabitacio(int numeroHabitacion) {
        Habitacio habitacio = new Habitacio(numeroHabitacion);
        System.out.println("L'habitació agregada és:");
        System.out.println(numeroHabitacion);
        habitacions.put(habitacio.getNumero(), habitacio);
    }

    // Mètode per reservar una habitació de l'hotel identificada pel seu número
    public Habitacio reservarHabitacio(int numero) {
        Habitacio habitacio = habitacions.get(numero);
        if (habitacio == null) {
            throw new IllegalArgumentException("L'habitació no existeix.");
        }
        habitacio.reservar();
        return habitacio;
    }

    // Mètode per alliberar una habitació de l'hotel identificada pel seu número
    public void liberarHabitacio(int numero) {
        Habitacio habitacio = habitacions.get(numero);
        if (habitacio == null) {
            throw new IllegalArgumentException("L'habitació no existeix.");
        }
        habitacio.liberar();
    }
}
