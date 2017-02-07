import java.util.HashMap;
import java.util.Map;

public class DNA {
	private char [] dnaChars;
	private Map<Character, Integer> nucleotidesCounter = new HashMap<>();
	DNA(String dnaString){
		dnaChars = dnaString.toCharArray();
	}
	public int count(Character nucleotideChar) {
		switch(nucleotideChar){
		case 'A':
		case 'C':
		case 'G':
		case 'T':
			return getmatches(nucleotideChar);
		default: 
			throw(new IllegalArgumentException());
		}
	}
	public Map<Character, Integer> nucleotideCounts(){
		nucleotidesCounter.put('A',getmatches('A'));
		nucleotidesCounter.put('C',getmatches('C'));
		nucleotidesCounter.put('G',getmatches('G'));
		nucleotidesCounter.put('T',getmatches('T'));
		
		return nucleotidesCounter;
	}
	private int getmatches(Character letter){
		int matches = 0;
		for(char nucleotide : dnaChars)
			if(letter.equals(nucleotide))
				matches++;
		return matches;
	}
}