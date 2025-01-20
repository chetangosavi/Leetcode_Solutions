package leetcodesolutions.basics;


class Employee{
	//Data Member
	int employeeId;
	String empName;
	
	//DefaultConstructor:
	Employee(){};
	
	//Constructor:
	Employee(int employeeId,String empName){
		this.employeeId = employeeId;
		this.empName = empName;
	}
	
	//Methods
	
	void display(){
		System.out.println("EmployeeId: "+employeeId + "\nEmployee Name: "+empName);
		
	}
}
//Static Block Example:
class StaticBlock{
	static {
		System.out.println("Hello World");
	}
}

public class OOPs {
	
	public static void main(String[] args) {
		/*
		   class :	A class is a collection of data members and Methods
		   			- using keyword class we can create class
		   			
		   Object : An instance of class is known as object
		   	        Ex - ClassName objName = new ClassName();
		   	
		   	
		 */
		
		Employee emp1 = new Employee(1 ,"chetan");
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.display(); 
		
		//StaticBlock st = new StaticBlock();

	}

}
