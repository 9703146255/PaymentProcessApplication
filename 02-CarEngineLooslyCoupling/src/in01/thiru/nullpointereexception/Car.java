package in01.thiru.nullpointereexception;
/*
 ==>when we create interface object ref it will initailize the def value as null 
 
 ==>if we perform any operations on null than we will get NullPointerExecepion
 
 */
public class Car {
	
	private Engine eng;
	
	
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
