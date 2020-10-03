package wyrazeniaSterujace;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 7_3
 * "Petle while i do-while"
 */
public class PetleWhileOrazDoWhile {
    public static void main(String[] args) {

        int iterator = 1;

        while (iterator == 2) {
            System.out.println("Jestem w petli While");
        }

        do {
            System.out.println("Jestem w petli Do-While");
        } while (iterator == 2);

    }
}
