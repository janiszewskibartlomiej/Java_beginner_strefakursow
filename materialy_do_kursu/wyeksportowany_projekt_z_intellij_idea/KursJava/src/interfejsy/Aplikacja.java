package interfejsy;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 9_1
 * "Interfejsy"
 */
public class Aplikacja {
    public static void main(String[] args) {

        Robot robot = new Robot(1954);
        robot.uruchom();

        Czlowiek czlowiek = new Czlowiek("Alan");
        czlowiek.oddychaj();

        Informacje[] informacje = new Informacje[] {robot, czlowiek};

        for (Informacje i: informacje) {
            i.pokazInformacje();
        }

        Informacje infoRobot = new Robot(999);
        infoRobot.pokazInformacje();

        ProcesyKognitywne[] procesyKognitywnes = new ProcesyKognitywne[] {robot, czlowiek};

        for (ProcesyKognitywne i: procesyKognitywnes) {
            i.mysl();
        }
    }

    public static void testInterfejsu(Informacje info) {
        info.pokazInformacje();
    }
}
