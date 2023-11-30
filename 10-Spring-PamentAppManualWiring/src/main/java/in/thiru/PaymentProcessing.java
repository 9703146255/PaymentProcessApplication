package in.thiru;

//in.thiru.PaymentProcessing
public class PaymentProcessing {

	public PaymentProcessing() {
		System.out.println("PaymentProcessing():: 0-args construtor");
	}

	private IPayment payment;

	public void setPayment(IPayment payment)
	{
		this.payment = payment;
	}

	

	public void Payment(double amount) {
		boolean payments = payment.pay(amount);

		if (payments) {
			System.out.println("payment sucess..");
		} else {
			System.out.println("payment failed..");
		}
	}





	

}
