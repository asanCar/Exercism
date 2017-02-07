import java.util.ArrayList;
import java.util.List;

public class Anagram {
	private List<Character> letters = new ArrayList<>();
	private List<String> result = new ArrayList<>();
	private String word;
	public Anagram(String word){
		this.word = word;
		for(char letter : word.toLowerCase().toCharArray())
			letters.add(letter);
	}
	public List<String> match(List<String> words){
		if(!words.isEmpty()){
			checkList(words);
		}
		return result;
	}
	private void checkList(List<String> list){
		for(String anagram : list){
			if(anagram.length()==letters.size()){
				ArrayList<Character> lettersCheck = new ArrayList<> (letters);
				for(Character c : anagram.toLowerCase().toCharArray()){
					if(lettersCheck.contains(c)){
						lettersCheck.remove(c);
						if(lettersCheck.isEmpty() && !anagram.toLowerCase().equals(word.toLowerCase()))
							result.add(anagram);
					}
				}
			}
		}
	}
}