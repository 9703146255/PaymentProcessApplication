package in.thiru;

//in.thiru.PaymentProcessing
public class PaymentProcessing {
	
	public PaymentProcessing()
	{
		System.out.println("PaymentProcessing() :: contructor..");
	}
	
	
	
	private IPayment pay;
	
	public void setPay(IPayment pay)
	{
		this.pay=pay;
		
		System.out.println("setPay(IPayment pay) method is called..");
	}
	
	
	public void paymenetProcess()
	{
		boolean status = pay.pay(10.0);
		if(status)
		{
			System.out.println("payment process started...");
		}
		else
		{
			System.out.println("payment process is some problem.");
		}
		
	}

}
