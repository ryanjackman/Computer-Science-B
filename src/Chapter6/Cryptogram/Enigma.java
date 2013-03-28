package Chapter6.Cryptogram;

public class Enigma {
	
	private String lookupTable;
	private int[] counts;
	private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public Enigma(int length) {
		lookupTable = "";
		for( int i = 0; i > length; i++ )
			lookupTable += "-";
	}

	public void setSubstitutions(String subs){	
	}
	
	public void setSubstitution(int k, char l){
		
	}
	
	String decode(String text){
		return "";
	}
	
	public void countLetters(String text){
		char[] ch = text.toCharArray();
		for(char c : ch ){
			counts[letters.indexOf(c)]++;
		}
	}
	
	public int getFrequencyPos(int k){
		return 0;
	}

	public String getHints(String text, String lettersByFrequency) {
		return null;
	}
}
