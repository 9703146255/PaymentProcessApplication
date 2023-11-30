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
	
	
	System.out.println("==============CreditCardPayment========================");
	CreditCardPayment credit1 = context.getBean(CreditCardPayment.class);
	CreditCardPayment credit2 = context.getBean(CreditCardPayment.class);
	CreditCardPayment credit3 = context.getBean(CreditCardPayment.class);
	
	System.out.println("CreditCardPayment : "+credit1.hashCode());
	System.out.println("CreditCardPayment : "+credit1.hashCode());
	System.out.println("CreditCardPayment : "+credit1.hashCode());
	
	System.out.println("=================DebitCardPayment=====================");
	DebitCardPayment debit1 = context.getBean(DebitCardPayment.class);
	DebitCardPayment debit2 = context.getBean(DebitCardPayment.class);
	DebitCardPayment debit3 = context.getBean(DebitCardPayment.class);
	
	System.out.println("DebitCardPayment : "+debit1.hashCode());
	System.out.println("DebitCardPayment : "+debit2.hashCode());
	System.out.println("DebitCardPayment : "+debit3.hashCode());

	System.out.println("=============SodexoCardPayment========================");
	SodexoCardPayment sodexo1 = context.getBean(SodexoCardPayment.class);
	SodexoCardPayment sodexo2 = context.getBean(SodexoCardPayment.class);
	SodexoCardPayment sodexo3 = context.getBean(SodexoCardPayment.class);
	
	System.out.println("SodexoCardPayment : "+sodexo1.hashCode());
	System.out.println("SodexoCardPayment : "+sodexo2.hashCode());
	System.out.println("SodexoCardPayment : "+sodexo3.hashCode());
	


	
	
	
  }
}
