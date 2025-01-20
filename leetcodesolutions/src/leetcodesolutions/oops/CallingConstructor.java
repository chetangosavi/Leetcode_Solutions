package leetcodesolutions.oops;


class Employee{
	String name;
	int age;
	
	Employee(){
		this("Chetan",25);
	}
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name : " + name + "\nage: "+age);
	}
}
public class CallingConstructor {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.display();

	}

}
