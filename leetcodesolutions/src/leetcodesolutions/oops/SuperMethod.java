package leetcodesolutions.oops;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name= name;
		this.age=age;
	}
	
	public String toString() {
		return this.name +"\n"+this.age+"\n";
	}
}

class Hero extends Person{
	String power;
	
	Hero(String name, int age, String power){
		super(name,age);                      
		this.power = power;
	}
	public String toString() {
		return super.toString()+this.power;
	}
	
}

public class SuperMethod {

	public static void main(String[] args) {
		/*
		 	Super :
		 			Keyword refers to the super class(Parent class) of an object
		 			very similar to this keyword
		 */
		
		Hero h1 = new Hero("chetan",25,"Meditation");
		System.out.println("Information about Hero \n" +h1.toString());

	}

}
