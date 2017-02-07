import java.util.HashMap;
import java.util.Map;

public class WordCount {
	private Map<String, Integer> result = new HashMap<>(); 
	public Map<String, Integer> phrase (String text){
		String [] textArr = text.replaceAll("[^\\w0-9 ]", "").split(" ");
		getmatches(textArr);
		return result;
	}
	private void getmatches(String [] txt){
		for(String word : txt){
			word=word.toLowerCase();
			if(result.containsKey(word))
				result.replace(word, result.get(word)+1);
			else if(!word.equals(""))
				result.putIfAbsent(word, 1);
		}
	}
}