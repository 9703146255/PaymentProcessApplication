package in.thiru;

public class Test {
	
	public static void main(String[] args) 
	{
		
		

		//constructor injection
//		PaymentProcessing pp1=new PaymentProcessing(new CreditCardPayment());
//		pp1.processingPayment();
//		
//		PaymentProcessing pp2=new PaymentProcessing(new CreditCardPayment());
//		pp2.processingPayment();
		
		//setter injection
//		CreditCardPayment  credit=new CreditCardPayment();
//		DebitCardPayment  debit=new DebitCardPayment();
	
//		//PaymentProcessing p1=new PaymentProcessing(credit);
//		PaymentProcessing p2=new PaymentProcessing(debit);
//		//p1.processingPayment();
//		p2.processingPayment();
		
		
		
		//constructor injection
		PaymentProcessing pp1=new PaymentProcessing(new CreditCardPayment());
		
		
		
		//setter injection
		pp1.setPaymentProcessing(new DebitCardPayment());
		pp1.processingPayment();
		
		/*
		 IF WE USE CI AND SI THEN SI WILL BE OVERRIDES THE CONSTRUCTOR INJECTION...
		 */
		
		
		
		
		
		
		
	}

}
