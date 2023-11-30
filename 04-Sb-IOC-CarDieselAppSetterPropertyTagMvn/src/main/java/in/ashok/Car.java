package in.ashok;
public class Car {
	
	
	private IEngine engine;

	
	
	public void setEngine(IEngine engine) 
	{
		this.engine = engine;
		System.out.println("setEngine() method called");
	}
	
	public void drive()
	{
		boolean status = engine.start();
		
		if(status)
		{
			System.out.println("journey started....");
		}
		else
		{
			System.out.println("engine failed to start...");
		}
	}

}
