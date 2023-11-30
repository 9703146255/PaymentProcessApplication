package in.ashok;

public class DieselEngine implements IEngine{

	public DieselEngine()
	{
		
		System.out.println("DieselEngine() :: CLASS CONSTRUCTOR");
	}
	
	public boolean start() 
	{
		
	System.out.println("DieselEngine starting....");
	
		return true;
	}

}
