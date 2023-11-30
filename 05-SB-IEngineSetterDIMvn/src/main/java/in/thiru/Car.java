package in.thiru;


//in.thiru.Car
public class Car {
	
	public Car()
	{
		System.out.println("Car() :: constructror..");
	}
	
	private IEngine eng;
	
	
	public void setEng(IEngine eng)
	{
		this.eng=eng;
		System.out.println("setter method is called..");
	}
	
	
	public void drive()
	{
		boolean status = eng.start();
		if(status)
		{
			System.out.println("driving started...");
		}
		else
		{
			System.out.println("some problem in the engine");
		}
	}

}
