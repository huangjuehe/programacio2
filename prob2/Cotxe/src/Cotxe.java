public class Cotxe {
    private String marca;
    private String model;
    private int any;
    private double velocitatActual;

    // Constructor
    public Cotxe(String marca, String model, int any) {
        this.marca = marca;
        this.model = model;
        this.any = any;
        this.velocitatActual = 0;
    }

    public void accelerar(double increment) {
        if (increment > 0) {
            this.velocitatActual += increment;
        }
    }

    public void frenar(double decrement) {
        if(decrement > 0){
            this.velocitatActual -= decrement;
            if (this.velocitatActual < 0) {
                this.velocitatActual = 0;
            }
        }
    }

    public void mostrarInformacio() {
        System.out.printf("Cotxe: %s %s %d. Velocitat actual: %.2f km/h.%n",
                marca, model, any, velocitatActual);
    }
}