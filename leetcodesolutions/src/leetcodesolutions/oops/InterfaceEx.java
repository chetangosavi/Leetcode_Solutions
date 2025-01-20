package leetcodesolutions.oops;

interface Car{
	void displayCarInfo();
}

class CarInfo implements Car{
	String carName;
	
	CarInfo(String carName){
		this.carName = carName;
	}
	
	@Override
	public void displayCarInfo() {
		System.out.println(carName);
	} //----------------------------------> overrriden methods from interface must be public
	
}
public class InterfaceEx {

	public static void main(String[] args) {
		CarInfo c1 = new CarInfo("Audi");
		c1.displayCarInfo();

	}

}
