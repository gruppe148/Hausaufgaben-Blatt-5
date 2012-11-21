import java.lang.*;
import java.util.Arrays;

public class Zahlen {

	public int a;
	public int b;
	public int c;

	public int [] zahlenArray= {4,12,16,18,20};

	/**
 	 * Gibt die Größte Zahl eines 3-Tuppels aus
	 */
	public void printMaxNumber() {
		
		/*Es gibt eine Standard Methode im Java.math die Zahlen vergleicht Math.max(int, int) */
		
		int max = Math.max( a, Math.max(b,c) );

		System.out.println( "Die größte Zahl=" + max);	
	}

	/**
	 * Gibt die Mittlere Zahl eines 3-Tuppels aus
	 */
	public void printMiddleNumber(){
	
		/*Man nimmt die 3 Zahlen steckt sie in ein Array und lasst es sortieren
 		* Dann muss man nur noch das erste bzw mittlere bzw letzte Element aus dieser
 		* Liste betrachten 
 		*/
	
		int[] sortarray = {a,b,c};
		Arrays.sort(sortarray);
		System.out.println( "Die mittlere Zahl=" + sortarray[1]);	
	}

	/**
	 * Gibt die kleinste Zahl eines 3-Tuppels aus
	 */ 
	public void printMinNumber(){

		/* Alternative gegeben durch vergleich */

		int min = c; //Annahme das c die kleinste sei

		if( a<b && a<c ) // überprüfen ob a die kleinste ist
		  min = a;
		else if ( b<c ) //Nun genügt es noch b zu überprüfen
		  min = b;

		System.out.println("Die Kleinste Zahl="+ min);
	}

	/**
	 * Gibt den ausgeschriebenen Name einer Zahl aus.
	 * @param num Zahl die ausgeschrieben werden soll in Definitionsbereich [0,5]
	 */
	public void printNameOfNumber(int num) {

		String numberName; // Name der Zahl

		switch( num ) // geh durch alle Möglichkeiten in [0,5]
		{
			case 0: numberName = "null"; break;
			case 1: numberName = "eins"; break;
			case 2: numberName = "zwei"; break;
			case 3: numberName = "drei"; break;
			case 4: numberName = "vier"; break;
			case 5: numberName = "fünf"; break;
			//default für alle Zahlen die nicht im angegebenen Intervall liegen
			default: numberName = "Die eingegebene Zahl ist außerhalb des Definitionsbereichs";
		}

		System.out.println(numberName);
	}	

/*Aufgabe 3*/

	/**
	 * Gibt alle Geraden Zahlen im Intervall [a,b] an die konsole aus.
	 *
	 * Falls a>b werden a und b vertauscht
	 * In der Aufgabenstellung war verlangt, dass man es mit 2 verschiedenen Methoden implementiren soll
	 *
	 * @param a (untere) Intervallgrenze
	 * @param b (obere) Intervallgrenze
	 */
	public void printGeradeZahlen(int a, int b) {

		/*Falls b kleiner a tausche a und b mit XOR-swap*/
		if(a>b)
		{
			a ^= b;
			b = a^b;
			a ^= b;
		}

		if( a%2 != 0 )
		  a++;

		//For Methode
		System.out.println("Ausgabe der Zahlen mit for-Schleife ");

		/*a ist gerade */
		for( int i=a; i<=b; i+=2 ) //i wird nur gebraucht, aufgrund der Bedingung, dass man diese Methode 2x implementieren soll
		{
			System.out.print(i + " ");
		}

		System.out.print("\n");

		/*While Methode*/
		System.out.println("Ausgabe der Zahlen mit while-Schleife");

		int i=a;

		while( i<=b )
		{
			System.out.print(i + " ");
			i+=2;
		}

		System.out.print("\n");
	}


	/** 
	 * Berechnet rekursiv die Fakultät
	 *
	 * @param a Zahl von der a! berechner werden soll
	 * @return (a-1)! oder 1 falls a==0
	 */ 	
	public int factorial (int a) {

		if( a == 0)
		  return 1;
		else
		  return a*factorial(a-1);
	}

	/**
	 * Gibt a! an die Konsole aus
	 *
	 * a kann nicht größer 12 sein da der Wertebereich von int beschräkt ist
	 *
	 * @param a Zahl von der a! an die konsole ausgegeben werden soll
	 */	
	public void printFactorial (int a) {

		if( a>12 )
		{
			System.out.println("Kann nicht ohne implementierung von BigInt ermöglicht werden");
			return;
		}
/* **********************************************
		int fac = 1;

		for( int i=1; i<=a; i++ )
		{
			fac *= i;
		}
************************************************/
		System.out.println("Die Fakultät von " + a + " ist " + factorial(a) );
	}

/*Aufgabe 4*/

	/** 
	 * Gibt ein fixes Array formatiert an die Konsole aus
	 *
	 *  @param numberOfItems gibt an bis welchem Index ausgegeben werden soll
 	 */ 
	public void printArray (int numberOfItems) {

		System.out.println("Index\tElement");
		System.out.println("_______________");

		for( int i=0; i< numberOfItems; i++ ) {

			System.out.println( i + "\t" + zahlenArray[i] );
		}
	}

	/**
	 * Gibt ein fixes Array formatiert, aber rückwärts, an die Konsole aus
	 *
	 *  @param numberOfItems gibt an von welchem Index an ausgegeben werden soll
	 */
	public void printReverseArray (int numberOfItems) {

		System.out.println("Index\tElement");
		System.out.println("_______________");

		for( int i=numberOfItems-1; i>=0 ; i-- ) {

			System.out.println( i + "\t" + zahlenArray[i] );
		}
	}


}

class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args)
   	{
		Zahlen num = new Zahlen();

//Aufgabe 2
		num.a = 4;
		num.b = 2;
		num.c = 5;

		num.printMaxNumber();
		num.printMiddleNumber();
		num.printMinNumber();

		num.printNameOfNumber(1);
		num.printNameOfNumber(6);

//Aufgabe 3
		num.printGeradeZahlen(3,9);
		num.printFactorial(5);

//Aufgabe 4
		int length = num.zahlenArray.length;	
		num.printArray( length );
		num.printReverseArray(length);
   	}
}
