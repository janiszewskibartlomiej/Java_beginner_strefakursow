package klasyAbstrakcyjne;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 9_2
 * "Klasy abstrakcyjne"
 */
public abstract class Maszyna {

    private int numerSeryjny;

    public void przypiszNumerSeryjny(int numerSeryjny) {
        this.numerSeryjny = numerSeryjny;
    }

    public int pobierzNumerSeryjny() {
        return numerSeryjny;
    }

    public abstract void uruchom();
}
