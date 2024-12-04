package leetcodesolutions.strings;

public class AddingSpacestoaString {

	public static void main(String[] args) {
		String s = "LeetcodeHelpsMeLearn";
		int[] spaces = {8,13,15};
		
		int m = s.length();
		int n = spaces.length;
		
	    int sPointer = 0;
	    int spacePointer = 0;
	    StringBuilder res = new StringBuilder();
	    while(sPointer < m) {
	    	if(spacePointer < n && sPointer == spaces[spacePointer]) {
	    		res.append(" ");
	    		spacePointer++;
	    	}
	    	res.append(s.charAt(sPointer));
	    	sPointer++;
	    }
	    
	    System.out.println(res);

	}

}
