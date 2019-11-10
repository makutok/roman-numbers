package RomanNumbers;

public class RomanNum {
	private char let;		//'M'
	private int val;		//1000
	private RomanNum next;
	
	public RomanNum (char letter, int val, RomanNum nextNum) {
		this.let = letter;
		this.val = val;
		this.next = nextNum;
	}

	public char getLetter () {
		return let;
	}

	public int getVal () {
		return val;
	}

	public RomanNum getNext () {
		return next;
	}
}
