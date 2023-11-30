package in02.thiru.constructorinjection;
/*

 ==> when we inject one class object into another class constructor by using constructor is called setter injection
 
 
 
 */
public class Car {
	
	private Engine eng;
	
	//initialaizing here otherwise we will get null pointer exception
	public Car(Engine eng) 
	{
		
		this.eng=eng;
	}
	
	void drive()
	{
		int status = eng.start();
		if(status>=1)
		{
			System.out.println("car is started...");
		}
		else
		{
			System.out.println("car getting some problem");
		}
	}
	
}
