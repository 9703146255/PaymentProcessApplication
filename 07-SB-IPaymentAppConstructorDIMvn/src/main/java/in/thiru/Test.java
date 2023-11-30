package in.thiru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) 
	{
       ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
       PaymentProcessing payprocess = context.getBean(PaymentProcessing.class);
       payprocess.paymenetProcess();
	
	}

}
