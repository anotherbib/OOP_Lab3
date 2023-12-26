public class PayPal implements Payment{
	@Override
	public void pay() {
		System.out.println("Paying with PayPal...");
	}
}
