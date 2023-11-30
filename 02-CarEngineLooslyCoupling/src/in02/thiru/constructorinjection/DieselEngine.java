package in02.thiru.constructorinjection;

public class DieselEngine implements Engine{

	@Override
	public int start() {
		
		System.out.println("Diesel engine started.....");
		return 1;
	}

}
