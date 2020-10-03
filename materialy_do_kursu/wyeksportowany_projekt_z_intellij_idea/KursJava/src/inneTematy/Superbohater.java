package inneTematy;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 13_1
 * "Wyliczenia"
 */
public enum Superbohater {
    BATMAN(10), SUPERMAN(5), WONDER_WOMAN(1);

    private int moc;

    Superbohater(int moc) {
        this.moc = moc;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }
}
