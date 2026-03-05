import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompteBancariTest {
    private CompteBancari compte;

    @BeforeEach
    void setUp() {
        compte = new CompteBancari("123456789", 1000.0);
    }

    @Test
    void testConstructorSaldoNegatiu() {
        CompteBancari compteNegatiu = new CompteBancari("987654321", -500.0);
        assertEquals(0.0, compteNegatiu.getSaldo(), "El saldo inicial no ha de ser negatiu.");
    }

    @Test
    void testGetNumeroCompte() {
        assertEquals("123456789", compte.getNumeroCompte(), "El número de compte no coincideix.");
    }

    @Test
    void testDipositarCorrectament() {
        compte.dipositar(500.0);
        assertEquals(1500.0, compte.getSaldo(), "El saldo no s'ha actualitzat correctament després del dipòsit.");
    }

    @Test
    void testDipositarQuantitatNegativa() {
        compte.dipositar(-100.0);
        assertEquals(1000.0, compte.getSaldo(), "No hauria de permetre ingressar quantitats negatives.");
    }

    @Test
    void testRetirarCorrectament() {
        compte.retirar(200.0);
        assertEquals(800.0, compte.getSaldo(), "El saldo no s'ha actualitzat correctament després de la retirada.");
    }

    @Test
    void testRetirarMésDelSaldoDisponible() {
        compte.retirar(2000.0);
        assertEquals(1000.0, compte.getSaldo(), "No hauria de permetre retirar més diners dels disponibles.");
    }

    @Test
    void testRetirarQuantitatNegativa() {
        compte.retirar(-100.0);
        assertEquals(1000.0, compte.getSaldo(), "No hauria de permetre retirar quantitats negatives.");
    }
}
