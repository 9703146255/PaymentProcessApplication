package in02.thiru.composition;
/*
 One class will talk to another class in two ways
 
 1]INHERITANCE [IS A]
 
 If we extends the properties from one class to another class in future we can't extends 
 
 becouse java not support multiple inheritence
 
 2]COMPOSITION [HAS A]
 
 */
public class Engine {
	
	public int start() 	 	//hear i changed fron int to long then we will get error here
	{						//if i change the one functionality it will effect the other functionality
		System.out.println("engine started.........");
		
		return 1;
	}

}
