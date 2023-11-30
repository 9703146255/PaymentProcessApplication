package in.thiru;

//in.thiru.DieselEngine
public class DieselEngine implements IEngine
{
	
	public DieselEngine()
	{
		System.out.println("DieselEngine() :: constructor..");
	}

	@Override
	public boolean start() {
		System.out.println("Diesel engine started....");
		
		return true;
	}

}
