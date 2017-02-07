public class Hamming {
	public static int compute(String strand1, String strand2){
		int result = 0;
		if(!strand1.isEmpty() && !strand2.isEmpty() && strand1.length()==strand2.length()){
			char [] charStrand1 = strand1.toCharArray();
			char [] charStrand2 = strand2.toCharArray();
			for(int i=0; i<charStrand1.length; i++)
				result = (charStrand1[i] != charStrand2[i]) ? result+=1 : result;
		}
		else if(strand1.length()!=strand2.length())
			throw new IllegalArgumentException();
		return result;
	}
}