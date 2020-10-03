package inneTematy;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 13_3
 * "Referencje do metod"
 */
public class ReferencjeDoMetod {
    public static void main(String[] args) {

        Klasa klasa = new Klasa();

        Interfejs interfejs = Klasa::new;
        interfejs.wywolajMetode();
    }
}

class Klasa {
    public void metoda() {
        System.out.println("To jest przykladowa metoda...");
    }
}

interface Interfejs {
    Klasa wywolajMetode();
}