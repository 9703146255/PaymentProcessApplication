package in02.thiru.constructorinjection;

public class Test {
	
	public static void main(String[] args) {
		
		Car c=new Car(new DieselEngine());
		c.drive();
		
	}

}
