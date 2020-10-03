public class Aplikacja {
    public static void main(String[] args) {

        Czlowiek czlowiek_1 = new Czlowiek() {
            @Override
            public void mysl() {
                System.out.println("Czlowiek mysli...");
            }
        };
        czlowiek_1.mysl();

        Korporacja korporacja = new Korporacja();
        korporacja.zarzadzaj(new Czlowiek() {
            @Override
            public void mysl() {
                System.out.println("Czlowiek mysli...");
            }
        });

        korporacja.zarzadzaj(() -> System.out.println("Czlowiek mysli..."));
    }
}

class Korporacja {
    public void zarzadzaj(Czlowiek cz) {
        System.out.println("Zarzadzanie zasobami aktywne.");
        cz.mysl();
    }

}

interface Czlowiek {
    void mysl();
}
