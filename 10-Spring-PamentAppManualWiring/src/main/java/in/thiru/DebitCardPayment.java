package in.thiru;

//in.thiru.DebitCardPayment
public class DebitCardPayment implements IPayment {

	public DebitCardPayment() {
		System.out.println("DebitCardPayment()  :: 0-PARAM CONSTRUCTOR");
	}

	@Override
	public boolean pay(double amount) {
		System.out.println("debit card payment is started....");
		return true;
	}

}
