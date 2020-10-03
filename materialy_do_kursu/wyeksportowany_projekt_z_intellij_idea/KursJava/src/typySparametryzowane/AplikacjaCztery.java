package typySparametryzowane;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 10_4
 * "Parametryzacja interfejsow"
 */
public class AplikacjaCztery {
    public static void main(String[] args) {

        Zamowienie<Integer, Double> zamowienie = new Zamowienie<>(10, 100.123);

        System.out.println("Identyfikator zamowienia, to: " + zamowienie.pobierzIdentyfikator());
        System.out.println("Wartosc zamowienia, to: " + zamowienie.pobierzWartosc());
    }
}

class Zamowienie<I, W> implements Informacje<I, W> {

    private I identyfikator;
    private W wartosc;

    public Zamowienie(I identyfikator, W wartosc) {
        this.identyfikator = identyfikator;
        this.wartosc = wartosc;
    }

    @Override
    public I pobierzIdentyfikator() {
        return identyfikator;
    }

    @Override
    public W pobierzWartosc() {
        return wartosc;
    }
}

interface Informacje<I, W> {
    I pobierzIdentyfikator();
    W pobierzWartosc();
}