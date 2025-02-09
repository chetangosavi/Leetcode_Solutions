package leetcodesolutions.basics;
import java.util.*;

class Book {
	
	String name;
	String author;
	
	 Book(String name,String author){
		this.name = name;
		this.author = author;
		
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(author, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(name, other.name);
	}


	@Override
	 public String toString() {
		return name + " by " + author;
		 
	 }
}

public class BooksManagement {
	
	public static void main(String[] args) {
		ArrayList<Book> listOfBooks = new ArrayList<>();
		listOfBooks.add(new Book("Harry Pooter","Jk-Rowling"));
		listOfBooks.add(new Book("OOPs","Danniel"));
		listOfBooks.add(new Book("The Mermaid","Fisher"));
		listOfBooks.add(new Book("The Biddle and the bard","Gordric Hollow"));
		listOfBooks.add(new Book("Last Summer","Mrs Donald"));
		listOfBooks.add(new Book("Those few Days","Romeo"));
		
		listOfBooks.set(1, listOfBooks.get(2));
		
		System.out.println(listOfBooks.size());
		listOfBooks.remove(1);
		
		System.out.println(listOfBooks.size());
		
		System.out.println(listOfBooks);
		
		Book searchFor = new Book("Harry Pooter" , "Jk-Rowling");
		
		int indexOfHarry = listOfBooks.indexOf(searchFor);
		System.out.println(indexOfHarry);
		if(indexOfHarry!= -1) {
			System.out.println("Books: "+listOfBooks.get(indexOfHarry));
		}

	}

}
