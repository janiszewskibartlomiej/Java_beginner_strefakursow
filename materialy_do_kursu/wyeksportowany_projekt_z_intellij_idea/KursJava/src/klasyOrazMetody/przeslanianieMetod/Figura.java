package klasyOrazMetody.przeslanianieMetod;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 8_5
 * "Przeslanianie metod"
 */
public class Figura {

    private double wymiarJeden;
    private double wymiarDwa;

    public Figura(double wymiarJeden, double wymiarDwa) {
        this.wymiarJeden = wymiarJeden;
        this.wymiarDwa = wymiarDwa;
    }

    public void obliczPolePowierzchni() {
        System.out.println("Nie wiem dla jakiej figury mam obliczac pole.");
    }
}
