package in.thiru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
  public static void main(String[] args)
  {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
	PaymentProcessing ppObj = context.getBean(PaymentProcessing.class);
	ppObj.Payment(100.00);
	
  }
}
