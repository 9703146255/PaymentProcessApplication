package in.thiru;
//in.thiru.PetrolEngine
public class PetrolEngine implements IEngine{
	
	public PetrolEngine()
	{
		System.out.println("PetrolEngine() :: Constructor");
	}
	

	@Override
	public boolean start() {
		
		System.out.println("petrol engine started....");
		
		return true;
	}
	
	

}
