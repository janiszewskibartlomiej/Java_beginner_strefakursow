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

![alt text](https://github.com/janiszewskibartlomiej/Java_from_scratch_in_code_me/blob/master/2020-09-11_07h33_37.png "hermetyzacja")

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
 
 ![alt text](https://github.com/janiszewskibartlomiej/Java_from_scratch_in_code_me/blob/master/2020-09-11_09h09_26.png "nazewnictwo 1")
 ![alt text](https://github.com/janiszewskibartlomiej/Java_from_scratch_in_code_me/blob/master/2020-09-11_09h10_04.png "nazewnictwo 2")
 ![alt text](https://github.com/janiszewskibartlomiej/Java_from_scratch_in_code_me/blob/master/2020-09-11_09h10_09.png "nazewnictwo 3")
 ![alt text](https://github.com/janiszewskibartlomiej/Java_from_scratch_in_code_me/blob/master/2020-09-11_09h10_21.png "nazewnictwo 4")
 ![alt text](https://github.com/janiszewskibartlomiej/Java_from_scratch_in_code_me/blob/master/2020-09-11_09h10_44.png "nazewnictwo 5")
 ![alt text](https://github.com/janiszewskibartlomiej/Java_from_scratch_in_code_me/blob/master/2020-09-11_09h10_53.png "nazewnictwo 6")
 
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
```

![alt text](https://github.com/janiszewskibartlomiej/Java_beginner_strefakursow/blob/master/2020-09-13_09h52_30.png "Typy")
 ![alt text]( "Typy")
 ![alt text]( "Typy")

```java


```
