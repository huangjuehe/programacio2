/*
Crea una classe Cotxe que tingui les següents propietats privades:
• marca (String)
• model (String)
• any (int)
• velocitatActual (double)
La classe ha de tenir:
1. Un constructor per inicialitzar marca, model i any. La velocitat inicial serà 0.
2. Mètodes accelerar(double increment) i frenar(double decrement), que modifiquin
la velocitat del cotxe. La velocitat no pot ser negativa.
3. Un mètode mostrarInformacio() que imprimeixi la informació del cotxe.
Després, crea una classe Main amb el mètode main, on:
• Es creï un objecte de tipus Cotxe.
• S'executin els mètodes accelerar() i frenar().
• Es mostri la informació del cotxe després de cada operació.
 */

public class Main{
    public static void main(String[] args) {
        Cotxe cotxe1 = new Cotxe("BMW", "X6", 2024);
        cotxe1.mostrarInformacio();
        cotxe1.accelerar(125.5);
        cotxe1.mostrarInformacio();
        cotxe1.frenar(60.4);
        cotxe1.mostrarInformacio();
        cotxe1.frenar(200);
        cotxe1.mostrarInformacio();
    }
}