package typySparametryzowane;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 10_2
 * "Parametryzacja klas"
 */
public class AplikacjaDwa {
    public static void main(String[] args) {

        KlasaGeneryczna<Double, Object> klasaGeneryczna = new KlasaGeneryczna<>(10.0, "Jeden");
        klasaGeneryczna.nazwaTypuGenerycznego();

        double wartosc = klasaGeneryczna.getPoleGeneryczne();
    }
}
