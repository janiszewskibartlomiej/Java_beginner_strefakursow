```java

1.

package strefakursu_java_beginner;

public class PierwszyProgram { //public to modyfikator dostępu, nazwa klasy camelcase i tylko litery

	public static void main(String[] args) { // main to nazwa metody a w nawiasie jest jest parametr args i typ string,
		//do metody main mozemy przekazac jakies dane w tym wypadku println "...."
		// void to metoda ktora kotra cos robi ale nic nie zwraca
		//static przed main oznacza ze moze byc wywolana bez tworzenia obiektu, ta metoda jest wywolywana przed stworzeniem jakich kolwiek obiektów.
		// TODO Auto-generated method stub
		System.out.println("Jestem programistą!!!");

	}

}

// zeby go uruchomic trzeba go najpierw zapisac i nazwac dokladnie tak jak sie nazywa klasa i trzeba go skompilowac
// kompilowanie poprzez "javac PierwszyProgram.java"
// uruchamianie poprzez "java PierwszyProgram""
// mozna uruchomic z argumentami jak mamy je przekazane w programie >> "java PierwszyProgram piort dziki"  >> to są 2 zmienne
```
2.

![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-11_07h33_37.png "hermetyzacja")

```java

3. 

package strefakursu_java_beginner;   // info o pakiecie
import mojPierwszyPakiet.MojaPierwszaKlasa;   //import

public class PrzykladowaKlasa {
	private MojaPierwszaKlasa mojaPierwszaKlasa;  //importowana klasa   << to sa pola
	private int x;  // to sa pola
	private int y; // to sa pola
	
	public PrzykladowaKlasa() {
		
	}  // to jest konstruktor

	
	public PrzykladowaKlasa(int x, int y) {   // to jest drugi konstruktor
		this.x = x;
		this.y = y;
	} 
	
	private int dodajDwieLiczbyDoSiebie(int x, int y) {
		
		Test test = new Test();  //jezlei chcemy wywoalc klase w klasie to jest utworzenei powinno byc po wywolaniu
		
		return x + y;
	}
	
	private class Test {
		
	}
	
	//getery i setery na koncu klasy
	
	public int getX( ) {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	
}


4. konwencja bloki kodu, wciecia, znaki biale, dlugosc linii

public class CzystyKod {
	
	public static void main(String[] args) {
		
		/*if () { 
			
		} else {  taka jest konwencja bloku if else
			
		}*/
		
		int x = 5;
		int y = 6; //srednik okresla koniec lini
		int z = x + y; //trzeba dawac odstepy pomiedzy zmiennymi
		
		System.out.println(z);  //trzeba dać odstęp przed z aby było to czytelniejsze. Trzeba rozdzielac logoczne czesci kodu odstepami  
	}
}


5. Nazewnictwo
 ```
 
 ![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-11_09h09_26.png "nazewnictwo 1")
 ![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-11_09h10_04.png "nazewnictwo 2")
 ![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-11_09h10_09.png "nazewnictwo 3")
 ![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-11_09h10_21.png "nazewnictwo 4")
 ![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-11_09h10_44.png "nazewnictwo 5")
 ![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-11_09h10_53.png "nazewnictwo 6")
 
```java
6. komentarze

// jednowierszowy

/*
komentarz wielowierszowy
*/

/**
* to jest komentarz dokumentujacy  - sluzy do dokumumentacji - tworzenia
*/

uzywanie komentraza dokumentujacego przed np metoda widac od razu np @param.

package orm.dao;

public class Komentarze {

    int x;
    int y;

    /**
     * To jest konstruktor klasy Komentarze
     * @param x
     * @param y
     */
    public Komentarze(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * To jest metoda main
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * To jest metoda mnozaca 2 wartosci przez siebie
     * @param x Parametr nr 1
     * @param y Parametr nr 2
     * @return iloczyn x i y
     */
    private int pomnoz(int x, int y) {
        return x * y;
    }
}

// tworzenie dokumentacji z cmd  >> przechodzimy do katalogu w kotrm jest ten plik
//"javadoc -d nazwaNowegoKataloguWKtorymBedzieDokumentacj -private Komentarze.java"

/*
* lub z pozycji IDE  Tools>>Generate JavaDoc ...
* 
* lokalizacja u mnie D:\GITHUB\Java_DB-Postgraduate_studies_on_WSB\src\main\java\orm\dao\Dokumentacja
* */

7. 	Typy danych

typy proste = to nie są obiekty == int x = 10; to jest przypisanie liczby 10 bezpośrednio do zmiennej x 

mozna oczywiscie Integer x  = Integer.valueof(10);  i wtedy mamy referencje do obeiktu 10

w przypadku obiektow Klasa y = new Klasa(10); nastepuje przypisanie miejsca w pamieci do zmiennej y - referencja
```


![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-13_09h52_30.png "Typy")
![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-13_09h57_15.png "Typy")


```java

char c1 = 0;
char c3 = 'A', c4 = 65, c5 = 0041, c6 = '\u0041'; // u\0041 dobry do ujecia w jakisms stringu u\ = standard unicode
    
String string = "\u0041BCD";
    
boolean b1 = true, b2 = false; // rozmiwar 8 bitow (1 bajt) 

7. zmienne

Życie zmiennych sa okreslane przez bloki kodu, zmienna zadeklarowana np w petli for ni ebedzie mozliwa do wykozystania poza blokie kodu 
[deklaracja zmiennej musi nastapic przed jej inicjalizacja]

rzutowanie typów >> int i = 10;  short j = (short) i; --- przerobieni typu i z int na short

trzeba pamietac ze  zmienno przecinkowe na int to znaczy liczba calkowita >>  double e = 3.999  int f = (int) e;

8 tablice

int[] tablica = new int[10];  // tablica 0-9 - 10 elemoentow gdzie kazdy bedzie sie rowna 0
    // to jest 1 przyklad inicjalizacji

    int[] tablica2 = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};  // drugi sposob inicjalizacji tablicy
    
  tablice wielowymiarowe:
  
      int [][] macierz2d = new int[][] {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
    };
    
    int xx = macierz2d[1][2]; // 7
    
    int [][][] macierz3d = new int[][][] {
            {{1,2}, {3, 4}},
            {{5, 6}, {7, 8}}
    };
    
    int yy = macierz3d[1][1][0]; //7


// mozna tez int [][][] macierz3d = new int[1][2][3]
```
![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-15_15h36_02.png "Tablice")
![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-15_15h35_30.png "Tablice")


9. operatory

![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-15_15h50_45.png "Operatory")
![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-15_15h52_18.png "Operatory")
![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-15_15h53_48.png "Operatory")
![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-15_15h54_10.png "Operatory")
![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-15_15h54_34.png "Operatory")



Java przechowuje całkowitoliczbowe wartosci w systemie binarnym

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-16_13h04_12.png "system binarny")
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-16_13h04_57.png "wyliczenie wartości binarnej")
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-16_13h06_36.png "dopełnienie do 2")



![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-16_23h41_49.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-16_23h42_46.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-16_23h46_56.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-16_23h51_18.png)

10. Math 
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-17_11h28_57.png)

ps mozna podejrzec biblioteke standardowa w >> exr=ternal Libraries >> 1.8 >> rt.jar >> java >> lang >> class Math 

11. IF

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_09h41_15.png "IF")

skrutrowy zapis dla prostych instrukcji warunkowych

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_09h45_35.png "IF SKRUTOWY")

NIE POWINNISMY ZAGNIERZDZAC KODU WIECEJ NIZ 3-4 BLOKI

12. SWITCH

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_09h59_12.png "SWITCH")

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_10h00_45.png "SWITCH 2")

13. while and do while

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_12h10_31.png "While")
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_12h11_50.png "Do While")


14. for i for each

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_12h24_36.png "for konstrukcja")
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_12h23_10.png "for przyklady")

for each 

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_12h29_38.png "for each przykłady")

15. break continue + etykiety:

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_20h14_35.png "break")

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_20h18_25.png "break + etykiety")

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_20h22_46.png "continue")

16. return

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_20h32_22.png "return")

17. instanceof >> sprawdzanie typu danych poprzez:

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_20h37_12.png "instanceof")

18. słowa kluczowe:

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_20h42_34.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_20h43_20.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-20_20h44_23.png)

19. Wprowadzenie do klas:

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_09h38_01.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_09h40_42.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_10h29_22.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_10h29_36.png)

20. metody

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_13h44_50.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_13h46_22.png)

21. przeciazanie konstruktorów i metod:

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_13h53_13.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_13h54_39.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_13h55_54.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_13h56_26.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_13h58_23.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-21_13h59_10.png)


22. Dziedziczenie

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_09h20_16.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_09h20_01.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_09h20_43.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_09h22_51.png)

23. przyslanianie metod


![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_09h32_46.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_09h34_42.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_09h36_58.png)

24. słowo kluczowe final:
 możemy wykozystac do:
 a) tworzenia stalej >> final private int STALA = 10;
 b) do oznaczenia klasy aby nie mogla byc dziedziczona >> final punlic class SowoKluczowe {}
 c) do oznaczenia metody ktora nie bedzi emogla byc przyslonieta/nadpisana  >> final public void test() {}

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_09h47_18.png)

25. Klasy wewnętrzne:

Jeżeli główna klasa jest publick to klasa ktora jest wnie lub pod nią musi być private.

Tworzymy je po to aby nie byly wykozystywane przez inne

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_09h53_34.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_09h56_10.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_09h59_50.png)

26. metody i pola statyczne

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_10h07_31.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_11h05_28.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_11h05_56.png)

27. Rekurencja  czyli wywoływanie siebie wewnatrz metody, natomiast porzera mocno zasoby pamieci.

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_11h35_46.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_11h37_01.png)

28. Interfejsy
W interfejsach wszytskie pola i metody sa domyslnie jako final static. Interfejsy sa uzywane do definowania pul i metod ktore  mozemy wykozaystac w innych klasach.
 wywolanie np public class Robot implements Interface {.....}  musimy zaimplementowac metode z interface

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_13h54_06.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_13h54_12.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_13h54_18.png)

29. klasy abstrakcyjne  >> do zdefiniowaniaj akis ogulnych danych/metod ktore w innych klasach maja byc implementowanie na swoj sposob. 
w tym wypadku nie trzeba nadpisywac metod. trzeba do klasy i metody dodac slowo kluczowe abstract.
dla metody abstrakcyjnej nie mozna stworzyc obiektu. Służy definiowania ogulnych warunkow ktre sa potem w kazdej klasie indywidualnei doprecyzowane

![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_14h03_47.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_14h08_05.png)
![](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-22_14h08_25.png)


30. klasa anonimowa kozystamy gdzy chcemy nadpisac metode w innej klasie na obiekcie






``java


```
