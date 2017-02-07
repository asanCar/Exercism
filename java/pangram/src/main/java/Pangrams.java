import java.util.HashSet;

public class Pangrams {
    public static boolean isPangram(String text) {
    	boolean result = false;
        if(!text.isEmpty()){
        	HashSet<Character> s = new HashSet<Character>();
        	for(Character character : text.toLowerCase().replaceAll("[^a-z]", "").toCharArray())
        		s.add(character);
        	if(s.size() == 26)
        		result = true;
        }
        return result;
    } 
}