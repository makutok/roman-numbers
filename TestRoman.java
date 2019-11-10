package RomanNumbers;

public class TestRoman {
	public static void main (String[] args) {
		System.out.println( Roman.decToRoman ( 1917 ) );
		System.out.println( Roman.romanToDec ( "CDLXXVI" ) );
		System.out.println( Roman.decToRoman ( 1931 ) );
		System.out.println( Roman.romanToDec ( "MCMXCIX" ) );
		System.out.println( Roman.decToRoman ( 2019 ) );
	}
}
