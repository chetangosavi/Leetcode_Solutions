package leetcodesolutions.coursera;
import java.util.ArrayList;

public class Students {

	class Student{
		String name;
		int age;
		int rollNumber;
		Student(){};
		Student(String name, int age, int rollNumber){
			this.name = name;
			this.age = age;
			this.rollNumber = rollNumber;
		};
	}
	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<>();
		
		Students students = new Students();
		
		Student s1 = students.new Student("chetan",26,1);
		Student s2 = students.new Student("rupesh",23,2);
		Student s3 = students.new Student("manish",28,3);
		Student s4 = students.new Student("bhushan",30,4);
		Student s5 = students.new Student("bhupesh",29,5);
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		
	}

}
