package leetcodesolutions.oops;


class Animals{
	String name = "Dog";
	void sound() {
		System.out.println("Sound Of Animal");
	}
}
class Dog extends Animals{
	void dis() {
		System.out.println("Name Of Animal: "+name);
	}
	void sound() {
		System.out.println("Sound Of Dog");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Animals a = new Animals();
		a.sound();
		
		Dog d = new Dog();
		d.sound();
		d.dis();

	}

}
