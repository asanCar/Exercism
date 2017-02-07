public class Bob {
	public Bob(){}
	public String hey (String sentence){
		if(sentence.replaceAll("\\s", "").isEmpty())
			return "Fine. Be that way!";
		else if(sentence.toUpperCase().equals(sentence) && !sentence.replaceAll("[^a-zA-Z]", "").isEmpty())
			return "Whoa, chill out!";
		else if(sentence.endsWith("?"))
			return "Sure.";
		else
			return "Whatever.";
	}
}