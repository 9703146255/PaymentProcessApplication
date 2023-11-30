package in.thiru;

//in.thiru.PaymentProcessing
public class PaymentProcessing {

	public PaymentProcessing() {
		System.out.println("PaymentProcessing():: 0-args construtor");
	}

	private IPayment pay;

	

	public void setPay(IPayment pay) {
		this.pay = pay;
	}

	public void Payment(double amount) {
		boolean payment = pay.pay(amount);

		if (payment) {
			System.out.println("payment sucess..");
		} else {
			System.out.println("payment failed..");
		}
	}

}
