package interfejsy;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 9_1
 * "Interfejsy"
 */
public class Czlowiek implements Informacje, ProcesyKognitywne {

    private String imie;

    public Czlowiek(String imie) {
        this.imie = imie;
    }

    public void oddychaj() {
        System.out.println(imie + " zaczal oddychac.");
    }

    @Override
    public void pokazInformacje() {
        System.out.println("Imie czlowieka, to: " + imie);
    }

    @Override
    public void mysl() {
        System.out.println(imie + " teraz mysli.");
    }
}
