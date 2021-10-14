package domain;

public class GuessGameLogic {
	private int theNumber;
	public int getNumber() {
		return theNumber;
	}

	public void setNumber(int theNumber) {
		this.theNumber = theNumber;
	}

	private int remainder = 5;
	private String hint;

	public GuessGameLogic() {	}

	public void initialize(int startNumber, int endNumber) {
		this.theNumber = generateRandomNumber(startNumber, endNumber);
	}

	public boolean isCorrectGuess(int guess) {
		if (guess == theNumber) {
			return true;
		} else {
			if (guess > theNumber)
				hint = "你猜的數字太大";
			else
				hint = "你猜的數字太小";
			remainder--;
			return false;
		}
	}
    //    0 <=  Math.random()  <1
	//    50 ~100
	//    range=100 -50 +1=51
	//    0*51 <=  Math.random()*51  <1*51   
	//    0<=  (int) Math.random()*51  <51
	private int generateRandomNumber(int startNumber, int endNumber) {
		int range =  endNumber - startNumber + 1;
		return startNumber + (int) (Math.random() * range);
	}

	public int getRemainder() {
		return remainder;
	}

	public String getHint() {
		return hint;
	}
}