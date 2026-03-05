class  CompteBancari {
    private String numeroCompte;
    private double saldo;

    // Constructor
    public CompteBancari(String numeroCompte, double saldoInicial) {
        this.numeroCompte = numeroCompte;
        this.setSaldo(saldoInicial);
    }

    // Getter per obtenir el saldo
    public double getSaldo() {
        return saldo;
    }

    // Getter per obtenir el número de compte
    public String getNumeroCompte() {
        return numeroCompte;
    }

    private void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: El saldo no pot ser negatiu.");
            this.saldo = 0;
        }
    }

    // Mètode per ingressar diners
    public void dipositar(double quantitat) {
        if (quantitat > 0) {
            saldo += quantitat;
            System.out.println("S'han ingressat " + quantitat + "€. Nou saldo: " + saldo + "€.");
        } else {
            System.out.println("Error: No es pot ingressar una quantitat negativa.");
        }
    }

    // Mètode per retirar diners
    public void retirar(double quantitat) {
        if (quantitat > 0) {
            if (quantitat <= saldo) {
                saldo -= quantitat;
                System.out.println("S'han retirat " + quantitat + "€. Nou saldo: " + saldo + "€.");
            } else {
                System.out.println("Error: Saldo insuficient per retirar " + quantitat + "€.");
            }
        } else {
            System.out.println("Error: No es pot retirar una quantitat negativa.");
        }
    }

    // Mètode per mostrar el saldo actual
    public void mostrarSaldo() {
        System.out.println("Saldo actual del compte (" + numeroCompte + "): " + saldo + "€.");
    }
}
