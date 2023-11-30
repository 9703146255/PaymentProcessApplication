package in.thiru;

public class PaymentProcessing 
{
	private IPayment payment;
	
	
	//initializing by using constructor
	public PaymentProcessing(IPayment payment)
	{
		this.payment=payment;
	}
	
	//initializing by using setter
	public void setPaymentProcessing(IPayment payment)
	{
		this.payment=payment;
	}
	
	
	
	public void processingPayment() 
	{
		boolean status = payment.pay(10.00);
		
		if(status)
		{
			System.out.println("payment is success");
		}
		else
		{
			System.out.println("payment is failure");
		}
	}

}
