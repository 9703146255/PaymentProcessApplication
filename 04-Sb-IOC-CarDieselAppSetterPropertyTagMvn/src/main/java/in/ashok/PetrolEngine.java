package in.ashok;

public class PetrolEngine implements IEngine{

	
	public PetrolEngine(){
		
		System.out.println("PetrolEngine() :: class constructor");
	}
	
	
	public boolean start() {
		
		System.out.println("PetroleEngine starting.....");
		
		return true;
	}

}
