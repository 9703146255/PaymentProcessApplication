package in.thiru;

public class CreditCardPayment implements IPayment
{
@Override
public boolean pay(Double amount) 
{
	System.out.println("credit card payment processing...");
	
	return true;
}
}
