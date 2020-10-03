package klasyOrazMetody.przeslanianieMetod;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 8_5
 * "Przeslanianie metod"
 */
public class Prostokat extends Figura {

    private double a;
    private double b;

    public Prostokat(double a, double b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    // Przeslonienie metody.
//    public void obliczPolePowierzchni() {
//        System.out.println(a * b);
//    }
}
