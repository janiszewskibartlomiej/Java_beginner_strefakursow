package typyProsteDanychOrazZmienne;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 4_6
 * "Konwersja i rzutowanie typów prostych"
 */
public class KonwersjaIRzutowanie {

    public static void main(String[] args) {

        int a = 10;
        long b = a;

        short c = 10;
        int d = c;

        double e = 3.999;
        int f = (int) e;

        int g = 10;
        double h = g;

        int i = 10;
        short j = (short) i;

        System.out.println(f);

//        boolean k = true;
//        char l = (boolean) k;
    }
}
