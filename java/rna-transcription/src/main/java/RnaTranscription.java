import java.util.Hashtable;

public class RnaTranscription {
	private Hashtable <Character,Character> dictionary = new Hashtable<>(4);
	private StringBuilder result = new StringBuilder();
	RnaTranscription(){
		dictionary.put('G', 'C');
		dictionary.put('C', 'G');
		dictionary.put('T', 'A');
		dictionary.put('A', 'U');
	}
    public String ofDna(String dnaString) {
    	if(dnaString.equals(""))
    		return "";
    	for(Character dnaChar : dnaString.toCharArray())
    		result.append(dictionary.get(dnaChar));
    	return result.toString();
    }
}