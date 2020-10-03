package podstawyJezykaJava;

import mojPierwszyPakiet.MojaPierwszaKlasaWIntellij;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 3_2
 * "Uklad pliku zrodlowego"
 */
public class PrzykladowaKlasa {

    // Lista pol.
    private MojaPierwszaKlasaWIntellij mojaPierwszaKlasaWIntellij;
    private int x;
    private int y;

    // Domyslny konstruktor.
    public PrzykladowaKlasa() {

    }

    // Konstruktor przeciazony.
    public PrzykladowaKlasa(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Wewnetrzna metoda.
    private int dodajDwieLiczbyDoSiebie(int x, int y) {

        Test test = new Test();

        return x + y;
    }

    // Klasa wewnetrzna.
    private class Test {

    }

    // Gettery i settery.
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
