package tablice;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 5_1
 * "Tablice jednowymiarowe"
 */
public class TabliceJednowymiarowe {

    public static void main(String[] args) {

        int[] tablica = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int x = tablica[5];

        tablica[0] = 10;

        System.out.println(tablica[10]);
    }
}
