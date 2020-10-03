package inneTematy;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 13_1
 * "Wyliczenia"
 */
public class Wyliczenia {

//    public static final int BATMAN = 0;
//    public static final int SUPERMAN = 1;
//    public static final int WONDER_WOMAN = 2;

    public static void main(String[] args) {

        Superbohater superbohater = Superbohater.BATMAN;

        switch (superbohater) {
            case BATMAN:
                break;
            case SUPERMAN:
                break;
            case WONDER_WOMAN:
                break;
            default:
                break;
        }

        System.out.println("Moc Batmana, to: " + Superbohater.BATMAN.getMoc());
    }
}
