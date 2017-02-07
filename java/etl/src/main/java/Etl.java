import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Etl {
	private Map<String, Integer> result = new HashMap<>();
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
    	if(old==null)
    		return null;
    	for(Integer points : old.keySet()){
    		for(String nwVal: old.get(points))
    			result.put(nwVal.toLowerCase(), points);
    	}
        return result;
    }
}