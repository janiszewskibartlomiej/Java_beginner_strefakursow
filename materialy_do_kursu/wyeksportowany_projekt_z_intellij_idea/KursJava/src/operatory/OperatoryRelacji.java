package operatory;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 6_4
 * "Operatory relacji"
 */
public class OperatoryRelacji {

    public static void main(String[] args) {

        int a = 5;
        int b = 4;

        boolean c = a == b;

        System.out.println("Wynik działania 'a == b': " + (a == b));
        System.out.println("Wynik działania 'a != b': " + (a != b));
        System.out.println("Wynik działania 'a > b': " + (a > b));
        System.out.println("Wynik działania 'a < b': " + (a < b));
        System.out.println("Wynik działania 'a >= b': " + (a >= b));
        System.out.println("Wynik działania 'a <= b': " + (a <= b));
    }
}
