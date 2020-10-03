package inneTematy;

import java.util.Scanner;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 13_5
 * "Odczyt danych z konsoli"
 */
public class OdczytDanych {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double waga;
        double wzrost;
        double bmi;

        System.out.println("Podaj swoja wage w kg:");
        waga = input.nextDouble();

        System.out.println("Podaj swoj wzrost w cm:");
        wzrost = input.nextDouble();

        bmi = waga / Math.pow((wzrost / 100), 2);

        System.out.printf("Twoje BMI, to: %.2f \n\n", bmi);

        System.out.println("< 18.5 - niedowaga");
        System.out.println("18.5 - 24.99 - waga prawidlowa");
        System.out.println(">= 25.0 - nadwaga");
    }
}
