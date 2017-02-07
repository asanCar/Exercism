import java.util.Random;

public class Robot {
	private String name;
	private final Character [] ALPHABET = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private final Integer [] NUMERIC = {0,1,2,3,4,5,6,7,8,9};
	public Robot(){}
	public String getName(){
		if(name==null)
			reset();
		return name;
	}
	public void reset(){
		name = ALPHABET[new Random().nextInt(ALPHABET.length)].toString()+
				ALPHABET[new Random().nextInt(ALPHABET.length)].toString()+
				NUMERIC[new Random().nextInt(NUMERIC.length)]+
				NUMERIC[new Random().nextInt(NUMERIC.length)]+
				NUMERIC[new Random().nextInt(NUMERIC.length)];
	}
}