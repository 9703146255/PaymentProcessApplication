package in.ashok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
		System.out.println("Spring container initialized");
		
		Car car = context.getBean(Car.class);
		car.drive();
	}

}
