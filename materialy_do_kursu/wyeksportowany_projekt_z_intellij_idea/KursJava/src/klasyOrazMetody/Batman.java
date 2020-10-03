package klasyOrazMetody;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 8_4
 * "Dziedziczenie"
 */
public class Batman extends Superbohater {

    private boolean batmobil;

    public Batman() {
        super();
    }

    public Batman(int punktyZycia, int sila, int zrecznosc, int wytrzymalosc, boolean batmobil) {
        super(punktyZycia, sila, zrecznosc, wytrzymalosc);
        this.batmobil = batmobil;
    }

    public void uzyjBatmobilu() {
        if (batmobil) {
            System.out.println("Batmobil zostal uzyty.");
        } else {
            System.out.println("Batmobil zostal w garazu.");
        }
    }
}
