public class Robot implements Informacje, ProcesyKognitywne {

    private int numerSeryjny;

    public Robot(int numerSeryjny) {
        this.numerSeryjny = numerSeryjny;
    }

    public void uruchom() {
        System.out.println("Robot nr " + numerSeryjny + " zostal uruchomiony.");
    }

    @Override
    public void pokazInformacje() {
        System.out.println("Numer seryjny robota, to: " + numerSeryjny);
    }

    @Override
    public void mysl() {
        System.out.println("Robot nr " + numerSeryjny + " teraz mysli.");
    }
}
