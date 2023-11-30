package in03.thiru.setterinjection;

public class Test {
	
	public static void main(String[] args) {
		
		Car c=new Car();
		
		c.setEng(new DieselEngine());
		c.drive();
		
	}

}
