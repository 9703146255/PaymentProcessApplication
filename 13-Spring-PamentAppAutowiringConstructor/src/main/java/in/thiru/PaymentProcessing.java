package in.thiru;

//in.thiru.PaymentProcessing
public class PaymentProcessing {

	public PaymentProcessing() {
		System.out.println("PaymentProcessing():: 0-args construtor");
	}

	private IPayment pay;
	
	
	

	public PaymentProcessing(IPayment pay) {
		super();
		this.pay = pay;
		
		System.out.println("PaymentProcessing(IPayment pay)  :: Parameteraised-Constructor");
	}

	public void setPay(IPayment pay) {
		this.pay = pay;

		// Print the class name of the object being set
		System.out.println("Class name of the object being set: " + pay.getClass().getName());
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
