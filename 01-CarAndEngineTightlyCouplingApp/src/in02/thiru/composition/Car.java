package in02.thiru.composition;

public class Car {
	
	public void drive()
	{
		Engine eng=new Engine();
		int status = eng.start();
		
		//if i add new engine here we need to change the code here
		
		if(status>=1)
		{
			System.out.println("car starting......");
		}
		else
		{
		System.out.println("problem in the engine please check once");	
		}
		
	}
	
	public static void main(String[] args) {
		
		Car c=new Car();
		c.drive();
		
	}

}
