package klasyAbstrakcyjne;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 9_2
 * "Klasy abstrakcyjne"
 */
public class Aplikacja {
    public static void main(String[] args) {

        // Maszyna maszyna = new Maszyna();
        Robot robot = new Robot();

        robot.przypiszNumerSeryjny(314159);
        System.out.println(robot.pobierzNumerSeryjny());

        robot.uruchom();
    }
}
