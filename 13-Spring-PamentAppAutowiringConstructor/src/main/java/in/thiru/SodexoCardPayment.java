package in.thiru;
//in.thiru.SodexoCardPayment
public class SodexoCardPayment implements IPayment
{
public SodexoCardPayment() {
	System.out.println("SodexoCardPayment() :: 0-Param-constructor");
}

@Override
public boolean pay(double amount) {
	System.out.println("sodexo card payment started......");
	return true;
}
}
