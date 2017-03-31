public class Acronym {
	private String phrase;
	private StringBuilder result = new StringBuilder();
	Acronym(String input){
		phrase = new String(input);
	}
	public String get(){
		String [] words = phrase.split("[^\\w0-9]");
		for(String word : words){
			if(word.length()==0)
				continue;
			result.append(word.charAt(0));
			if(word.equals(word.toUpperCase()))
				continue;
	    	for(Character letter : word.substring(1).toCharArray()){
	    		if(Character.isUpperCase(letter))
	    			result.append(letter);
	    	}
		}
		return result.toString().toUpperCase();
	}
}