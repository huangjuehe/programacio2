import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HabitacioTest {

    @Test
    void testHabitacionDisponibleAlCrear() {
        Habitacio habitacio = new Habitacio(101);
        assertTrue(habitacio.isDisponible(), "La habitación debería estar disponible al crearla.");
    }

    @Test
    void testReservarHabitacion() {
        Habitacio habitacio = new Habitacio(101);
        habitacio.reservar();
        assertFalse(habitacio.isDisponible(), "La habitación no debería estar disponible después de reservarla.");
    }

    @Test
    void testLiberarHabitacion() {
        Habitacio habitacio = new Habitacio(101);
        habitacio.reservar();
        habitacio.liberar();
        assertTrue(habitacio.isDisponible(), "L'habitació hauria d'estar disponible després d'alliberar-la.");
    }

    @Test
    void testReservarHabitacionYaReservada() {
        Habitacio habitacio = new Habitacio(101);
        habitacio.reservar();
        assertThrows(IllegalStateException.class, habitacio::reservar, "S'hauria de llançar excepció si s'intenta reservar una habitació ja reservada.");
    }
}
