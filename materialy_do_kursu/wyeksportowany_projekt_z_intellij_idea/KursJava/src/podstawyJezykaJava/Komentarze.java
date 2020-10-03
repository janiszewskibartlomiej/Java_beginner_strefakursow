package podstawyJezykaJava;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 3_5
 * "Komentarze i narzedzie javadoc"
 */
public class Komentarze {

    int x;
    int y;

    /**
     * To jest konstruktor klasy Komentarze.
     * @param x
     * @param y
     */
    public Komentarze(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Metoda main.
     * @param args
     */
    public static void main(String[] args) {

        // To jest komentarz jednowierszowy.

    	/* To jest komentarz wielowierszowy w jednym wierzu. */

    	/*
    	To jest komentarz wielowierszowy
    	w wielu wierszach
    	(w tym przypadku w dwóch... tzn. już w trzech... a raczej w pięciu)
		*/

        /**
         * To jest komentarz dokumentujący.
         */
    }

    /**
     * To jest metoda mnozaca przez siebie dwie wartosci.
     * @param x Parametr nr 1.
     * @param y Parametr nr 2.
     * @return Iloczyn x i y.
     */
    private int pomnoz(int x, int y) {
        return x * y;
    }
}
