package in.thiru;

//in.thiru.CreditCardPayment
public class CreditCardPayment implements IPayment {
	public CreditCardPayment() {
		System.out.println(" CreditCardPayment()  :: 0-param constructor");
	}

	@Override
	public boolean pay(double amount) {
		System.out.println("crditcard payment is started.....");

		return true;
	}
}
