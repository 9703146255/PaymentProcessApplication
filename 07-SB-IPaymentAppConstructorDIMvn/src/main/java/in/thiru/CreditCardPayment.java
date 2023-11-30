package in.thiru;
//in.thiru.CreditCardPayment
public class CreditCardPayment implements IPayment {
	
	public CreditCardPayment()
	{
		System.out.println("CreditCardPayment() :: constructor");
	}
	
	

	@Override
	public boolean pay() {

		System.out.println("credit card payment is started...");
		return true;
	}

}
