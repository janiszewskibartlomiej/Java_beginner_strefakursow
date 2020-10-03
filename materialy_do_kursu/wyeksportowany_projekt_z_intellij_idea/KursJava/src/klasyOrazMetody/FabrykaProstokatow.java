package klasyOrazMetody;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 8_1
 * "Wprowadzenie do klas"
 *
 * Odcinek 8_2
 * "Wprowadzenie do metod"
 *
 * Odcinek 8_3
 * "Przeciazanie konstruktorow i metod"
 */
public class FabrykaProstokatow {
    public static void main(String[] args) {

        Prostokat prostokatNumerJeden = new Prostokat(10, 5);
        Prostokat prostokatNumerDwa = new Prostokat(4, 2);

        Prostokat prostokatNowy = new Prostokat(5, 3, "Nowy prostokat");
//        System.out.println(prostokatNowy.getNazwaProstokata());

        prostokatNowy.test();
        prostokatNowy.test("Korzystam z drugiej metody test()");
        int poleProstokata = prostokatNowy.test(prostokatNowy.getA(), prostokatNowy.getB());
        System.out.println(poleProstokata);
    }
}
