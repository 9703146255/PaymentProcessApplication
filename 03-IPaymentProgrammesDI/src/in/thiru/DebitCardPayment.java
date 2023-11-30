package in.thiru;

public class DebitCardPayment implements IPayment{

	@Override
	public boolean pay(Double amount) 
	{
		System.out.println("debit card payment is processing...");
		return true;
	}

}
