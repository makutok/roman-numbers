package Test;

import RomanNumbers.Roman;

public class testRoman {
	public static void main (String[] args) {
		System.out.println( Roman.toRoman	( 1931 ) );
		System.out.println( Roman.toInteger ( "CDLXXVI" ) );
		System.out.println( Roman.toRoman( 689 ) );
		System.out.println( Roman.toInteger( "MCMXCIX" ) );
		System.out.println( Roman.toRoman( 2019 ) );
		System.out.println( Roman.toInteger( "DCLXXXIX" ) );
	}
}
