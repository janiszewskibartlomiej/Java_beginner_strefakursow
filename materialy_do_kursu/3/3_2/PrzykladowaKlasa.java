package podstawyJezykaJava;

import mojPierwszyPakiet.MojaPierwszaKlasaWIntellij;

/**
 * Created by Piotr Dzwiniel on 12.04.2016.
 */
public class PrzykladowaKlasa {

    private MojaPierwszaKlasaWIntellij mojaPierwszaKlasaWIntellij;
    private int x;
    private int y;

    public PrzykladowaKlasa() {

    }

    public PrzykladowaKlasa(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int dodajDwieLiczbyDoSiebie(int x, int y) {

        Test test = new Test();

        return x + y;
    }

    private class Test {

    }

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
