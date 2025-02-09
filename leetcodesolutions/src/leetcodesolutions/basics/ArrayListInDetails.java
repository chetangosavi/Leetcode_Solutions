package leetcodesolutions.basics;
import java.util.ArrayList;

public class ArrayListInDetails {
	/*
	 	Notes: ArrayList 
	 		- import java.util.ArrayList;
	 
	 */
	public static void main(String[] args) {
		ArrayList<Integer> daysOfTheMonth = new ArrayList<>();
		ArrayList<Integer> dates = new ArrayList<>();
		for(int i=0;i<10;i++) {
			daysOfTheMonth.add(i,i);
			dates.add(i,i);
		}
		System.out.println(daysOfTheMonth);
		
		//Methods :
		
		int size = daysOfTheMonth.size();
		System.out.println("Size of List = "+ size);
		
		boolean isPresent = daysOfTheMonth.contains(3);
		System.out.println(isPresent);
		
		System.out.println(daysOfTheMonth.isEmpty());
		
		daysOfTheMonth.set(3,10);
		System.out.println(daysOfTheMonth);
		
		System.out.println("Element at Index 3 : "+daysOfTheMonth.get(3));
		
		System.out.println(daysOfTheMonth.equals(dates));
		
		System.out.println(dates);
		
	    dates.remove(3); 
	    
	    System.out.println(dates);
	}

}
