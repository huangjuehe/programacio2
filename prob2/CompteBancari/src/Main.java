
public class Main {
    public static void main(String[] args) {
        CompteBancari compte = new CompteBancari("123456789", 1000.0);

        compte.dipositar(500.0);
        compte.mostrarSaldo();  // Saldo: 1500.0

        compte.retirar(200.0);
        compte.mostrarSaldo();  // Saldo: 1300.0

        compte.retirar(2000.0); // No ha de permetre la retirada
        compte.mostrarSaldo();  // Saldo: 1300.0

    }
}
