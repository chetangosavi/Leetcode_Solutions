package leetcodesolutions.basics;

public class StringInDetail {

	public static void main(String[] args) {
		//In Java, a String is an object that represents a sequence of characters.
		
		String str = "Chetan";  //String is a class in Java
		System.out.println(str);
		
		//Two ways of creating String in java
		//1) String literals and secong Using "new" keyword
		
			String str1 = "GeeksForGeeks";
			System.out.println(str1);
			//To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool). 
			
		//Another Way of defining string using new keyword
		String s  = new String("Welcome Home");
		System.out.println(s); 
		
		/*
		   A string acts the same as an array of characters in Java.
		     L E E T C O D E
		     0 1 2 3 4 5 6 7   -- String follows Zero based Indexing same as array
		 */
		
		/*
		   CharSequence Interface
		   CharSequence Interface is used for representing the sequence of Characters in Java.
		   1) String
		   2) StringBuilder:
		   		StringBuilder in Java represents an alternative to String and StringBuffer Class, 
		   		as it creates a mutable sequence of characters and it is not thread safe. It is used 
		   		only within the thread , so there is no extra overhead , so it is mainly used for 
		   		single threaded program.
		   		
		   		syntax : 
		   					StringBuilder strDemo = new StringBuilder();
							strDemo.append("Chetan");
		   3) StringBuffer:
		   		StringBuffer is a peer class of String, it is mutable in nature and it is thread safe class , 
		   		we can use it when we have multi threaded environment and shared object of string buffer i.e, 
		   		used by mutiple thread. As it is thread safe so there is extra overhead, so it is mainly 
		   		used for multithreaded program.
		   		
		   		syntax : StringBuffer strDemo = new StringBuffer("Chetan");
		   		
		   		
		   4) String Tokenizer class : String Tokenizer class is mainly used to break a string into Tokens
		   			
		   5) StringJoiner is a class in java.util package which is used to construct a sequence of characters(strings)
		      separated by a delimiter and optionally starting with a supplied prefix and ending with a supplied suffix
		 */
		
		String s1 = "Chetan";
		s1.concat("Gosavi");
		System.out.println(s1);   //chetan - beacuse strings are immutable it cannot be changed or modified
		
		//String methods:
		
		//concat():
			String s2 = "Chetan";
			s2 = s2.concat("Gosavi");
			System.out.println(s2);
			
		//Charcter.toString():
			char ch = 'a';
			String str3 = Character.toString(ch);
			System.out.println(str3);
			
		//substring():
			System.out.println(s2.substring(2,6)); //returns characters including charAT index 2 and excluding charAt index 6
			
		//indexOf():
			System.out.println(s1.indexOf(ch));
			

	}

}
