package RomanNumbers;

public class Roman {

	static RomanNum I = new RomanNum('I',    1, null);
	static RomanNum V = new RomanNum('V',    5, I);
	static RomanNum X = new RomanNum('X',   10, I);
	static RomanNum L = new RomanNum('L',   50, X);
	static RomanNum C = new RomanNum('C',  100, X);
	static RomanNum D = new RomanNum('D',  500, C);
	static RomanNum M = new RomanNum('M', 1000, C);

	static RomanNum[] RomanNumbers = { I, V, X, L, C, D, M };

	
	public static int romanToDec (String strRoman) {
		int dec = 0;
		RomanNum Roman = null;

		for (int c = 0; c < strRoman.length(); c++) {
			for (int r = 0; r < RomanNumbers.length; r++)
			{
				if (strRoman.charAt(c) == RomanNumbers[r].getLetter()) {
					Roman = RomanNumbers[r];
					break;
				}
			}
			if (c - 1 >= 0 && Roman.getNext() != null)
			{
				RomanNum nextRoman = Roman.getNext();
				if (strRoman.charAt(c - 1) == nextRoman.getLetter()) {
					dec = dec - 2 * nextRoman.getVal();
				}
			}
			dec = dec + Roman.getVal();
		}
		return dec;
	}

	
	public static String decToRoman (int dec) {
		String strRoman = "";
		RomanNum Roman = null;

		while (dec > 0) {
			for (int r = RomanNumbers.length - 1; r >= 0; r--) {
				Roman = RomanNumbers[r];
				
				if (dec >= Roman.getVal())
				{
					dec -= Roman.getVal();
					strRoman = strRoman + Roman.getLetter();
					break;
				}
				else if (dec + Roman.getNext().getVal() >= Roman.getVal())
				{
					Roman = Roman.getNext();
					dec += Roman.getVal();
					strRoman = strRoman + Roman.getLetter();
					break;
				}
			}
		}
		return strRoman;
	}

}
