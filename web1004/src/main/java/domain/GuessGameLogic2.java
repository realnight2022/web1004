package domain;

public class GuessGameLogic2 {
	private int theNumber;

	private int remainder = 5;
    private  String hint;
    
	//  OverLoad Constructor
	public GuessGameLogic2(int startNumber, int endNumber) {
//		String s="ABCDE";
//		s.substring(3);   //   DE
//		s.substring(0,3); //  ABC
		this.theNumber = generateRandomNumber(startNumber, endNumber);
	}
//  OverLoad Constructor
	public GuessGameLogic2(int startNumber, int endNumber, int remainder) {
		this.remainder = remainder;
		this.theNumber = generateRandomNumber(startNumber, endNumber);
	}
	public int getTheNumber() {
		return theNumber;
	}
	public boolean isCorrectGuess(int guess) {
		if (guess == theNumber) {
			return true;
		} else {
			if(guess>theNumber)
				 hint="你猜的數字太大";
			else
				 hint="你猜的數字太小";
					
			remainder--;
			return false;
		}
	}
    public String getHint() {
    	  return hint;
    }
	private int generateRandomNumber(int startNumber, int endNumber) {
		double range = (double) (endNumber - startNumber + 1);
		return startNumber + (int) (Math.random() * range);
	}

	public int getRemainder() {
		return remainder;
	}
}