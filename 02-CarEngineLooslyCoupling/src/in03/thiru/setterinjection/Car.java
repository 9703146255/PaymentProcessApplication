package in03.thiru.setterinjection;
/*
 ==> when we inject one class object into another class constructor by using setter method is called setter injection
 
 */
public class Car {
	
	private Engine eng;
	
	public void setEng(Engine eng) {
		
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
