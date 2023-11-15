package in.thiru;
//in.thiru.DebitCardPayment
public class DebitCardPayment implements IPayment{
	
	public DebitCardPayment()
	{
		System.out.println("DebitCardPayment() :: constructor...");
	}

	@Override
	public boolean pay(double amt) {
		System.out.println("debit card payment is started...");		
		
		
		return true;
	}
	
	



}
