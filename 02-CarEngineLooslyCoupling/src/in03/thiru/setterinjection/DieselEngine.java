package in03.thiru.setterinjection;

public class DieselEngine implements Engine{

	@Override
	public int start() {
		
		System.out.println("Diesel engine started.....");
		
		
		return 1;
	}

}
