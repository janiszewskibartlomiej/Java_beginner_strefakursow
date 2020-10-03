package typyProsteDanychOrazZmienne;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 4_7
 * "Opakowywanie typów prostych"
 */
public class OpakowywanieTypówProstych {

    public static void main(String[] args) {

        // Byte, Short, Integer, Long, Float, Double, Character i Boolean.

        int x = 10;
        Integer integer = x;

        int compare = integer.compareTo(15);

        System.out.println(compare);

        int y = integer;
    }
}
