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
 
 ![alt text]( "hermetyzacja")
 ![alt text]( "hermetyzacja")
 ![alt text]( "hermetyzacja")
 ![alt text]( "hermetyzacja")
 ![alt text]( "hermetyzacja")

```
