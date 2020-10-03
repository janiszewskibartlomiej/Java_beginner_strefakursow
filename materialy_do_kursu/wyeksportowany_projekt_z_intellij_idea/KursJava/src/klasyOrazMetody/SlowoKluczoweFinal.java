package klasyOrazMetody;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 8_6
 * "Slowo kluczowe final"
 */
final public class SlowoKluczoweFinal {

    final private int STALA;

    SlowoKluczoweFinal() {
        STALA = 10;
    }

    final public void test() {
        final int KOLEJNA_STALA = 10;
        System.out.println(STALA + KOLEJNA_STALA);
    }
}
