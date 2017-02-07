import java.util.TreeSet;
import java.util.Set;
import java.util.Map;
import java.util.Collections;
import java.util.TreeMap;

public class School {
	private TreeMap<Integer,TreeSet<String>> roster = new TreeMap<>();
	public School(){}
	public int numberOfStudents(){
		return roster.size();
	}
	public void add(String name, int grade){
		if(roster.containsKey(grade))
			roster.get(grade).add(name);
		else{
			roster.put(grade, new TreeSet<String>());
			roster.get(grade).add(name);
		}		
	}
	public Set<String> grade(int grade){
		if(roster.containsKey(grade))
			return Collections.unmodifiableSet(roster.get(grade));
		else 
			return Collections.unmodifiableSet(new TreeSet<String>());
	}
	public Map<Integer,TreeSet<String>> studentsByGradeAlphabetical(){
		return Collections.unmodifiableMap(roster);
	}
}