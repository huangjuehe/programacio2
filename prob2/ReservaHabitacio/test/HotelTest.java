import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    private Hotel hotel;

    @BeforeEach
    void setUp() {
        hotel = new Hotel("Gran Hotel Barcelona");
        hotel.agregarHabitacio(101);
        hotel.agregarHabitacio(102);
    }

    @Test
    void testAgregarHabitacio() {

        hotel.agregarHabitacio(103);
        hotel.agregarHabitacio(103);

        Habitacio habitacio = hotel.reservarHabitacio(103);
        assertNotNull(habitacio, "L'habitació hauria d'haver-se agregat correctament.");
        assertEquals(103, habitacio.getNumero(), "El número d'habitació hauria de ser 103.");
    }

    @Test
    void testReservarHabitacioExistent() {
        Habitacio habitacio = hotel.reservarHabitacio(101);
        assertFalse(habitacio.isDisponible(), "L'habitació hauria d'estar reservada.");
    }

    @Test
    void testReservarHabitacioNoExistent() {
        assertThrows(IllegalArgumentException.class, () -> hotel.reservarHabitacio(999), "Hauria de llançar excepció al reservar una habitació inexistent.");
    }

    @Test
    void testLiberarHabitacio() {
        hotel.reservarHabitacio(102);
        hotel.liberarHabitacio(102);
        Habitacio habitacio = hotel.reservarHabitacio(102); // Reservar novament després de liberar
        assertFalse(habitacio.isDisponible(), "L'habitació hauria d'estar disponible després d'alliberar-la.");
    }

    @Test
    void testLiberarHabitacioNoExistent() {
        assertThrows(IllegalArgumentException.class, () -> hotel.liberarHabitacio(999), "Hauria de llançar excepció al intentar alliberar una habitació inexistent.");
    }
}
