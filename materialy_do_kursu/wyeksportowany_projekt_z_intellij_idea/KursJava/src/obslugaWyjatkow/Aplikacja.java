package obslugaWyjatkow;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 11_4
 * "Tworzenie wlasnych podklas wyjatkow"
 */
public class Aplikacja {
    public static void main(String[] args) {

        try {
            nawiazPolaczenie(5);
        } catch (NiewlasciwyPort ex) {
            System.out.println(ex.toString());
        }
    }

    public static void nawiazPolaczenie(int numerPortu) throws NiewlasciwyPort {
        if (numerPortu < 0) {
            throw new NiewlasciwyPort("Proba otworzenia portu nr " + numerPortu);
        } else {
            System.out.println("Port nr " + numerPortu + " zostal otwarty.");
        }
    }
}

class NiewlasciwyPort extends Exception {

    public NiewlasciwyPort(String opisWyjatku) {
        super(opisWyjatku);
    }
}