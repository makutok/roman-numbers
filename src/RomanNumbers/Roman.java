package RomanNumbers;

public class Roman {
	
	private static RomanNum[] RomanNumbers;
	
	static {
		RomanNum I = new RomanNum('I',    1, null);
		RomanNum V = new RomanNum('V',    5, I);
		RomanNum X = new RomanNum('X',   10, I);
		RomanNum L = new RomanNum('L',   50, X);
		RomanNum C = new RomanNum('C',  100, X);
		RomanNum D = new RomanNum('D',  500, C);
		RomanNum M = new RomanNum('M', 1000, C);
		RomanNumbers = new RomanNum[] { I, V, X, L, C, D, M };
		
	}
	
	public static int toInteger (String strRoman) {
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

	
	public static String toRoman (int decimal) {
		String strRoman = "";
		RomanNum Roman = null;

		while (decimal > 0) {
			for (int r = RomanNumbers.length - 1; r >= 0; r--) {
				Roman = RomanNumbers[r];
				
				if (decimal >= Roman.getVal())
				{
					decimal -= Roman.getVal();
					strRoman = strRoman + Roman.getLetter();
					break;
				}
				else if (decimal + Roman.getNext().getVal() >= Roman.getVal())
				{
					Roman = Roman.getNext();
					decimal += Roman.getVal();
					strRoman = strRoman + Roman.getLetter();
					break;
				}
			}
		}
		return strRoman;
	}

}
