package obslugaWyjatkow;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 11_2
 * "Konstrukcja try-catch i slowo kluczowe finally"
 */
public class KonstrukcjaTryCatch {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Wyjatek " + ex.toString() + " zostal zlapany i obsluzony.");
        } catch (NullPointerException ex) {
            // Obsluga drugiego wyjatku.
        } finally {
            System.out.println("Operacje na koniec.");
        }

        System.out.println("Jakies dodatkowe operacje...");
    }
}


